package dev.negative.library.plugin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created By LeandroSSJ
 * Created on 06/04/2022
 */
public class Library extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Library classes loaded");
    }
}