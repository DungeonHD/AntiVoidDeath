package net.dungeon.antiVoidDeath.listener;

import net.dungeon.antiVoidDeath.config.ConfigManager;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TeleportListener implements Listener {

    private final ConfigManager configManager;

    public TeleportListener(ConfigManager configManager) {
        this.configManager = configManager;
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (!configManager.isEnabled()) return;

        Player player = event.getPlayer();
        Location location = player.getLocation();
        World world = location.getWorld();

        if (world == null || world.getEnvironment() != World.Environment.THE_END) return;

        if (location.getY() <= configManager.getEndTeleportCoordinate()) {
            World overworld = Bukkit.getWorlds().stream()
                    .filter(w -> w.getEnvironment() == World.Environment.NORMAL)
                    .findFirst()
                    .orElse(null);

            if (overworld == null) return;

            Location targetLocation = new Location(
              overworld,
              location.getX(),
              configManager.getOverworldSpawnPosition(),
              location.getZ()
            );

            // Save teleport position if the player lands in a block
            if (overworld.getBlockAt(targetLocation).getType() != Material.AIR) {
                targetLocation.add(0, 1, 0);
            }

            player.teleport(targetLocation);

            // Play the teleport-sound when activated
            if (configManager.isTeleportSoundEnabled()) {
                Sound sound = configManager.getTeleportSound();
                player.playSound(targetLocation, sound, 0.5f, 1.0f);
            }
        }
    }
}
