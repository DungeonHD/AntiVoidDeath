package net.dungeon.antiVoidDeath;

import net.dungeon.antiVoidDeath.config.ConfigManager;
import net.dungeon.antiVoidDeath.listener.TeleportListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiVoidDeath extends JavaPlugin {

    private ConfigManager configManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        configManager = new ConfigManager(this);
        getServer().getPluginManager().registerEvents(new TeleportListener(configManager), this);
        getLogger().info("AntiVoidDeath Plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiVoidDeath Plugin has been disabled!");
    }
}
