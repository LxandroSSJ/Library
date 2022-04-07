package dev.negative.library.api.util;

import org.bukkit.ChatColor;

/**
 * Created By LeandroSSJ
 * Created on 06/04/2022
 */
public class Format {


    public static String formatMessage(String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }
}
