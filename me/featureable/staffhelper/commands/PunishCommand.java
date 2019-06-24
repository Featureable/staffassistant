package me.featureable.staffhelper.commands;

import me.featureable.staffhelper.StaffHelper;
import me.featureable.staffhelper.gui.PunishUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PunishCommand implements CommandExecutor {

    private StaffHelper plugin;

    public PunishCommand(StaffHelper plugin) {
        this.plugin = plugin;

        plugin.getCommand("punish").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(plugin.shheadern + " You must be a player to execute that command.");
            return true;
        }

        if (!(sender.hasPermission("staffhelper.punish"))) {
            sender.sendMessage(plugin.shheader + " You do not have permission to execute that command.");
            return true;
        }

        if (args.length < 1) {
            sender.sendMessage(plugin.shheader + " Please enter a player name.");
            return true;
        }

        Player player = (Player) sender;
        player.openInventory(PunishUI.GUI(player));
        return true;
    }
}
