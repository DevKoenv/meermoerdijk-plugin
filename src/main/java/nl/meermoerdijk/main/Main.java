package nl.meermoerdijk.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main main;

    @Override
    public void onEnable() {
        // Plugin startup logic
        main = this;

        logToConsole("MeerMoerdijk Plugin is enabled!");

        // Register commands

        // Register events

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void logToConsole(String message){
        Bukkit.getLogger().info(ChatColor.translateAlternateColorCodes('&', message));
    }
}
