package me.featureable.staffhelper;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.UnsupportedEncodingException;

public class StaffHelper extends JavaPlugin {

    private char doubleArrow = '\u00BB';
    public String shheadern = ChatColor.translateAlternateColorCodes('&', "&cStaffHelper >>");
    public String shheader = ChatColor.translateAlternateColorCodes('&', "&cStaffHelper " + doubleArrow);

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(shheadern);
        
    }

    @Override
    public void onDisable() {

    }
}
