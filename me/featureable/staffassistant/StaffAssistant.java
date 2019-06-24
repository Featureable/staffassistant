package me.featureable.staffassistant;

import me.featureable.staffassistant.commands.ClearChat;
import me.featureable.staffassistant.commands.StaffChat;
import me.featureable.staffassistant.commands.ToggleChat;
import me.featureable.staffassistant.listeners.ChatListener;
import me.featureable.staffassistant.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class StaffAssistant extends JavaPlugin {

    private char doubleArrow = '\u00BB';
    public String shheadern = ChatColor.translateAlternateColorCodes('&', "&cStaffAssistant &8>>");
    public String shheader = ChatColor.translateAlternateColorCodes('&', "&cStaffAssistant &8" + doubleArrow + "&c");
    public String scheading = ChatColor.translateAlternateColorCodes('&', "&cStaffChat &8" + doubleArrow + "&c");

    public ArrayList<Player> staffChatMessagers = new ArrayList<Player>();

    public boolean chatDisabled = false;

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(shheadern + Utils.chat(" Enabled"));

        new ChatListener(this);
        new StaffChat(this);
        new ClearChat(this);
        new ToggleChat(this);
    }

    @Override
    public void onDisable() {

    }
}
