package me.featureable.staffhelper;

import me.featureable.staffhelper.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffUtils extends JavaPlugin {

    private char doubleArrow = '\u00BB';
    public String shheadern = ChatColor.translateAlternateColorCodes('&', "&cStaffHelper &8>>");
    public String shheader = ChatColor.translateAlternateColorCodes('&', "&cStaffHelper &8" + doubleArrow + "&c");

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(shheadern + Utils.chat(" Enabled"));
    }

    @Override
    public void onDisable() {

    }
}
