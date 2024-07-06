package me.abab.QWQTECH.utils;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.abab.QWQTECH.QWQTECH;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class Items {
    public static final ItemGroup QWQTECH_MAIN = new NestedItemGroup(new NamespacedKey(QWQTECH.getInstance(), "QWQTECH_MAIN"), new CustomItemStack(Material.AMETHYST_CLUSTER, "&x&f&f&f&f&f&fQ&x&f&f&e&3&f&fW&x&f&f&c&6&f&fQ&x&f&f&a&a&f&fT&x&f&f&8&e&f&fE&x&f&f&7&1&f&fC&x&f&f&5&5&f&fH", "&x&f&f&f&f&f&fq&x&f&f&e&e&c&cw&x&f&f&d&d&9&9q&x&f&f&c&c&6&6!&x&f&f&b&b&3&3!&x&f&f&a&a&0&0!"));
    public static final ItemGroup QWQTECH_ITEM = new SubItemGroup(new NamespacedKey(QWQTECH.getInstance(), "QWQTECH_ITEM"), (NestedItemGroup) QWQTECH_MAIN, new CustomItemStack(Material.NETHERITE_INGOT, "&x&a&a&a&a&a&aQ&x&b&3&b&3&b&3W&x&b&d&b&d&b&dQ&x&c&6&c&6&c&6T&x&d&0&d&0&d&0E&x&d&9&d&9&d&9C&x&e&3&e&3&e&3H&x&e&c&e&c&e&c-&x&f&6&f&6&f&6物&x&f&f&f&f&f&f品"));
    public static final ItemGroup QWQTECH_TOOL = new SubItemGroup(new NamespacedKey(QWQTECH.getInstance(), "QWQTECH_TOOL"), (NestedItemGroup) QWQTECH_MAIN, new CustomItemStack(Material.NETHERITE_PICKAXE, "&x&f&f&a&a&0&0Q&x&e&c&b&3&0&9W&x&d&9&b&d&1&3Q&x&c&6&c&6&1&cT&x&b&3&d&0&2&6E&x&a&1&d&9&2&fC&x&8&e&e&3&3&9H&x&7&b&e&c&4&2-&x&6&8&f&6&4&c工&x&5&5&f&f&5&5具"));
    public static ItemStack QWQ_DOWEL = new CustomItemStack(Material.END_ROD, "&x&5&5&f&f&5&5基&x&5&5&f&f&8&0础&x&5&5&f&f&a&a传&x&5&5&f&f&d&4动&x&5&5&f&f&f&f杆", "", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH","");
    public static ItemStack QWQ_DOWEL_PLUS = new CustomItemStack(Material.LIGHTNING_ROD, "&x&f&f&5&5&f&f&l高&x&f&f&5&5&d&4&l级&x&f&f&5&5&a&a&l传&x&f&f&5&5&8&0&l动&x&f&f&5&5&5&5&l杆", "", "&x&5&5&f&f&5&5&l更&x&8&e&f&f&5&5&l加&x&c&6&f&f&5&5&l坚&x&f&f&f&f&5&5&l固", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH", "");
    public static ItemStack QWQ_BILIBILI_PINK = new CustomItemStack(Material.PINK_BED, "&x&f&f&5&5&f&fBILIBILI-粉", "", "&x&f&f&5&5&f&f(゜-゜)つロ 干杯", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH", "");
    public static ItemStack QWQ_BILIBILI_BLUE = new CustomItemStack(Material.BLUE_BED, "&x&5&5&f&f&f&fBILIBILI-蓝", "", "&x&5&5&f&f&f&f(゜-゜)つロ 干杯", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH", "");
    public static ItemStack QWQ_BILIBILI = new CustomItemStack(Material.END_CRYSTAL, "&x&5&5&f&f&f&fb&x&6&a&e&a&f&fi&x&8&0&d&4&f&fl&x&9&5&b&f&f&fi&x&a&a&a&a&f&fb&x&b&f&9&5&f&fi&x&d&4&8&0&f&fl&x&e&a&6&a&f&fi&x&f&f&5&5&f&f?", "", "&x&5&5&f&f&f&f(&x&6&a&e&a&f&f゜&x&8&0&d&4&f&f-&x&9&5&b&f&f&f゜&x&a&a&a&a&f&f)&x&b&f&9&5&f&fつ&x&d&4&8&0&f&fロ&x&e&a&6&a&f&f干&x&f&f&5&5&f&f杯", "&x&5&5&f&f&f&f右&x&7&7&d&d&f&f键&x&9&9&b&b&f&f来&x&b&b&9&9&f&f玩&x&d&d&7&7&f&f玩&x&f&f&5&5&f&f?", "&x&f&f&f&f&f&fQ&x&f&f&f&0&f&fW&x&f&f&e&0&f&fQ&x&f&f&d&1&f&fT&x&f&f&c&1&f&fE&x&f&f&b&2&f&fC&x&f&f&a&2&f&fH&x&f&f&9&3&f&f-&x&f&f&8&3&f&fT&x&f&f&7&4&f&fO&x&f&f&6&4&f&fO&x&f&f&5&5&f&fL", "");
}
