package me.featureable.staffassistant.utils;

import me.featureable.staffassistant.StaffAssistant;
import org.bukkit.ChatColor;

public class Utils {

    private StaffAssistant plugin;

    public Utils(StaffAssistant plugin) {
        this.plugin = plugin;
    }

    public static String chat(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
