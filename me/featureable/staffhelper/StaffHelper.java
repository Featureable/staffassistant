package me.featureable.staffhelper;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffHelper extends JavaPlugin {

    public String shheader = ChatColor.translateAlternateColorCodes('&', ChatColor.BOLD + "&cStaffHelper");

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(shheader + " Starting.");
    }

    @Override
    public void onDisable() {

    }
}
