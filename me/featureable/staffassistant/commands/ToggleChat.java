package me.featureable.staffassistant.commands;

import me.featureable.staffassistant.StaffAssistant;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ToggleChat implements CommandExecutor {

    private StaffAssistant plugin;

    public ToggleChat(StaffAssistant plugin) {
        this.plugin = plugin;

        plugin.getCommand("togglechat").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("sa.togglechat")) {
            sender.sendMessage(plugin.shheader + ChatColor.RED + " You do not have permission to execute this command!");
            return true;
        }

        plugin.chatDisabled = !plugin.chatDisabled;
        if (plugin.chatDisabled) {
            Bukkit.broadcastMessage(plugin.shheader + ChatColor.RED + " Chat has been disabled.");
        } else {
            Bukkit.broadcastMessage(plugin.shheader + ChatColor.RED + " Chat has been enabled.");
        }
        return true;
    }
}
