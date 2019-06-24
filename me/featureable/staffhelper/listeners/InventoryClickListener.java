package me.featureable.staffhelper.listeners;

import me.featureable.staffhelper.StaffHelper;
import me.featureable.staffhelper.gui.MuteUI;
import me.featureable.staffhelper.gui.PunishUI;
import me.featureable.staffhelper.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    private StaffHelper plugin;

    public InventoryClickListener(StaffHelper plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        System.out.println("TSDG");
        String title = e.getInventory().getTitle();
        if (e.getClickedInventory() == null){
            return;
        }
        if (!(title.equals(PunishUI.inventory_name) || title.equals(MuteUI.inventory_name))) {
            return;
        }
        if(e.getCurrentItem()==null || e.getCurrentItem().getType()==Material.AIR||!e.getCurrentItem().hasItemMeta()){
            return;
        }
//        if (e.getCurrentItem() == null || e.getCurrentItem().getType().equals(Material.AIR)) {
//            return;
//        }
        if (title.equals(PunishUI.inventory_name)) {
            PunishUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
            e.setCancelled(true);
            return;
        }
        if (title.equals(MuteUI.inventory_name)) {
            //Bukkit.getPlayer("Featureable").sendMessage("DS");
            MuteUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
            e.setCancelled(true);
        }
    }
}
