package me.featureable.staffassistant;

import me.featureable.staffassistant.commands.ClearChat;
import me.featureable.staffassistant.commands.StaffChat;
import me.featureable.staffassistant.commands.ToggleChat;
import me.featureable.staffassistant.listeners.ChatListener;
import me.featureable.staffassistant.utils.PluginUpdater;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class StaffAssistant extends JavaPlugin {

    private char doubleArrow = '\u00BB';
    public String shheadern = ChatColor.translateAlternateColorCodes('&', "&cStaffAssistant &8>>&c");
    public String shheader = ChatColor.translateAlternateColorCodes('&', "&cStaffAssistant &8" + doubleArrow + "&c");
    public String scheading = ChatColor.translateAlternateColorCodes('&', "&cStaffChat &8" + doubleArrow + "&c");

    public ArrayList<Player> staffChatMessagers = new ArrayList<>();

    public boolean chatDisabled = false;
    public boolean slowChatEnabled = false;

    @Override
    public void onEnable() {
        new ChatListener(this);
        new StaffChat(this);
        new ClearChat(this);
        new ToggleChat(this);

        Bukkit.getConsoleSender().sendMessage(shheadern + ChatColor.GREEN + " Enabled.");
        PluginUpdater updater = new PluginUpdater(this, 68718);
        try {
            if (updater.checkForUpdates()) {
                Bukkit.getConsoleSender().sendMessage(shheadern + ChatColor.GREEN + " An update was found! New version: '" + updater.getLatestVersion() + "'. Download: " + updater.getResourceURL());
            } else {
                Bukkit.getConsoleSender().sendMessage(shheadern + ChatColor.GREEN + " Version: '" + updater.getLatestVersion() + "' up to date.");
            }
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage(shheadern + ChatColor.RED + " Could not check for updates! Stacktrace:");
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(shheadern + ChatColor.GREEN + " Disabled.");
    }
}
