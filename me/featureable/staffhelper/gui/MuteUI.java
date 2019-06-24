package me.featureable.staffhelper.gui;

import me.featureable.staffhelper.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MuteUI {

    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 3 * 9;

    public static void initialize() {
        inventory_name = Utils.chat("&cMute Player");

        inv = Bukkit.createInventory(null, inv_rows);
    }

    public static Inventory GUI(Player p) {
        Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);

        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 5, 1, 11, "&eMute", "&cMufsdsdfte a player");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 4, 1, 13, "&6Kick", "&cKick a player");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 1, 1, 15, "&cBan", "&cPermanently or temporarily ban a player");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 14, 1, 17, "&4Blacklist", "&cBlacklist a player");

        //Blank panels
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 1, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 2, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 3, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 4, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 5, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 6, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 7, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 8, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 9, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 10, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 12, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 14, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 16, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 18, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 19, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 20, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 21, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 22, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 23, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 24, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 25, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 26, "&f");
        Utils.createItemByte(inv, Material.STAINED_GLASS_PANE, 7, 1, 27, "&f");

        toReturn.setContents(inv.getContents());
        return toReturn;
    }

    public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
        if (clicked.getItemMeta().getDisplayName().equals(Utils.chat("&eMute"))) {
            p.sendMessage("Mute");
        }
    }
}