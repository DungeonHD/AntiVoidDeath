package net.dungeon.antiVoidDeath.config;

import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigManager {
    private final FileConfiguration config;

    public ConfigManager(JavaPlugin plugin) {
        this.config = plugin.getConfig();
    }

    public boolean isEnabled() {
        return config.getBoolean("Enabled", true);
    }

    public int getEndTeleportCoordinate() {
        return config.getInt("EndTeleportCoordinate", -60);
    }

    public int getOverworldSpawnPosition() {
        return config.getInt("OverworldSpawnPosition", 320);
    }

    public boolean isTeleportSoundEnabled() {
        return config.getBoolean("TeleportSound.Enabled", true);
    }

    public Sound getTeleportSound() {
        String soundName = config.getString("TeleportSound.Sound", "minecraft:block.portal.travel");
        try {
            String processedSoundName = soundName.toUpperCase()
                    .replace("MINECRAFT:", "")
                    .replace(".", "_");
            return Sound.valueOf(processedSoundName);
        } catch (IllegalArgumentException e) {
            return Sound.BLOCK_PORTAL_TRAVEL; // Fallback
        }
    }
}
