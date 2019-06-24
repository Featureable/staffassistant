package me.featureable.staffassistant.commands;

import me.featureable.staffassistant.StaffAssistant;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffChat implements CommandExecutor {

    private StaffAssistant plugin;

    public StaffChat(StaffAssistant plugin) {
        this.plugin = plugin;

        plugin.getCommand("staffchat").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(plugin.shheadern + ChatColor.RED + " You must be a player to execute this command!");
            return true;
        }
        if (!sender.hasPermission("sa.staffchat")) {
            sender.sendMessage(plugin.shheader + ChatColor.RED + " You do not have permission to execute this command!");
            return true;
        }

        Player p = (Player) sender;
        if (plugin.staffChatMessagers.contains(p)) {
            plugin.staffChatMessagers.remove(p);
            sender.sendMessage(plugin.shheader + ChatColor.RED + " Staff Chat disabled.");
            return true;
        } else {
            plugin.staffChatMessagers.add(p);
            sender.sendMessage(plugin.shheader + ChatColor.RED + " Staff Chat enabled.");
        }
        return true;
    }
}
