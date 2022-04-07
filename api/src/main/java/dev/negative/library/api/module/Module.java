package dev.negative.library.api.module;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created By LeandroSSJ
 * Created on 06/04/2022
 */
public interface Module {

    default void onEnable(JavaPlugin plugin) {
    }

    default void onDisable(JavaPlugin plugin) {
    }
}
