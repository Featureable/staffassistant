package me.featureable.staffassistant.commands;

import me.featureable.staffassistant.StaffAssistant;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ClearChat implements CommandExecutor {

    private StaffAssistant plugin;

    public ClearChat(StaffAssistant plugin) {
        this.plugin = plugin;

        plugin.getCommand("clearchat").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("sa.clearchat")) {
            return true;
        }

        for (int i = 0; i < 200; i++) {
            Bukkit.broadcastMessage("");
        }
        Bukkit.broadcastMessage(plugin.shheader + ChatColor.GREEN + " Chat has been cleared!");
        return true;
    }
}
