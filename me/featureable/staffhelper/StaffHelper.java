package me.featureable.staffhelper;

import me.featureable.staffhelper.commands.PunishCommand;
import me.featureable.staffhelper.gui.MuteUI;
import me.featureable.staffhelper.gui.PunishUI;
import me.featureable.staffhelper.listeners.InventoryClickListener;
import me.featureable.staffhelper.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffHelper extends JavaPlugin {

    private char doubleArrow = '\u00BB';
    public String shheadern = ChatColor.translateAlternateColorCodes('&', "&cStaffHelper &8>>");
    public String shheader = ChatColor.translateAlternateColorCodes('&', "&cStaffHelper &8" + doubleArrow + "&c");

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(shheadern + Utils.chat(" Enabled"));

        MuteUI.initialize();
        PunishUI.initialize();
        new InventoryClickListener(this);
        new PunishCommand(this);
    }

    @Override
    public void onDisable() {

    }
}
