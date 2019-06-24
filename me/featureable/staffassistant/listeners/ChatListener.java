package me.featureable.staffassistant.listeners;

import me.featureable.staffassistant.StaffAssistant;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    private StaffAssistant plugin;

    public ChatListener(StaffAssistant plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if (plugin.chatDisabled) {
            if (p.hasPermission("sa.bypass")) {
                e.setCancelled(false);
            } else {
                e.setCancelled(true);
                p.sendMessage(plugin.shheader + ChatColor.RED + " Chat is currently disabled.");
            }
        }

        if (plugin.staffChatMessagers.contains(p)) {
            Bukkit.broadcast(plugin.scheading + " " + ChatColor.GREEN + e.getPlayer().getDisplayName() + ": " + ChatColor.WHITE + e.getMessage(), "sa.staffchat");
            e.setCancelled(true);
        }
    }
}
