package me.featureable.staffassistant.listeners;

import me.featureable.staffassistant.StaffAssistant;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private StaffAssistant plugin;

    public JoinListener(StaffAssistant plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
    }
}
