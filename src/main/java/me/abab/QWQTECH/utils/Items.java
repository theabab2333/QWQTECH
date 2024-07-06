package me.abab.QWQTECH.utils;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.abab.QWQTECH.QWQTECH;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class Items {
    public static final ItemGroup QWQTECH_MAIN = new NestedItemGroup(new NamespacedKey(QWQTECH.getInstance(), "QWQTECH_MAIN"), new CustomItemStack(Material.AMETHYST_CLUSTER, "&x&f&f&f&f&f&fQ&x&f&f&e&3&f&fW&x&f&f&c&6&f&fQ&x&f&f&a&a&f&fT&x&f&f&8&e&f&fE&x&f&f&7&1&f&fC&x&f&f&5&5&f&fH"));
    public static final ItemGroup QWQTECH_ITEM = new SubItemGroup(new NamespacedKey(QWQTECH.getInstance(), "QWQTECH_ITEM"), (NestedItemGroup) QWQTECH_MAIN, new CustomItemStack(Material.COBBLESTONE, "&x&a&a&a&a&a&aQ&x&b&3&b&3&b&3W&x&b&d&b&d&b&dQ&x&c&6&c&6&c&6T&x&d&0&d&0&d&0E&x&d&9&d&9&d&9C&x&e&3&e&3&e&3H&x&e&c&e&c&e&c-&x&f&6&f&6&f&6物&x&f&f&f&f&f&f品"));
    public static ItemStack QWQ_DOWEL = new CustomItemStack(Material.END_ROD, "&x&5&5&f&f&5&5基&x&5&5&f&f&8&0础&x&5&5&f&f&a&a传&x&5&5&f&f&d&4动&x&5&5&f&f&f&f杆", "", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH","");
    public static ItemStack QWQ_DOWEL_PLUS = new CustomItemStack(Material.LIGHTNING_ROD, "&x&f&f&5&5&f&f&l高&x&f&f&5&5&d&4&l级&x&f&f&5&5&a&a&l传&x&f&f&5&5&8&0&l动&x&f&f&5&5&5&5&l杆", "", "&x&5&5&f&f&5&5&l更&x&8&e&f&f&5&5&l加&x&c&6&f&f&5&5&l坚&x&f&f&f&f&5&5&l固", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH", "");
    public static ItemStack QWQ_BILIBILI_PINK = new CustomItemStack(Material.PINK_BED, "&x&f&f&5&5&f&fBILIBILI-粉", "", "&x&f&f&5&5&f&f(゜-゜)つロ 干杯", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH", "");
    public static ItemStack QWQ_BILIBILI_BLUE = new CustomItemStack(Material.BLUE_BED, "&x&5&5&f&f&f&fBILIBILI-蓝", "", "&x&5&5&f&f&f&f(゜-゜)つロ 干杯", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH", "");
    public static ItemStack QWQ_BILIBILI = new CustomItemStack(Material.END_CRYSTAL, "&x&5&5&f&f&f&f&lB&x&6&8&e&c&f&f&lI&x&7&b&d&9&f&f&lL&x&8&e&c&6&f&f&lB&x&a&1&b&3&f&f&lI&x&b&3&a&1&f&f&lL&x&c&6&8&e&f&f&lI&x&d&9&7&b&f&f&l!&x&e&c&6&8&f&f&l!&x&f&f&5&5&f&f&l!", "", "&x&f&f&5&5&f&f&lB&x&e&7&6&d&f&f&lI&x&c&e&8&6&f&f&lL&x&b&6&9&e&f&f&lI&x&9&e&b&6&f&f&lB&x&8&6&c&e&f&f&lI&x&6&d&e&7&f&f&lL&x&5&5&f&f&f&f&lI", "&x&f&f&f&f&f&f&l就&x&f&8&f&8&f&8&l当&x&f&1&f&1&f&1&l这&x&e&a&e&a&e&a&l个&x&e&3&e&3&e&3&l是&x&d&c&d&c&d&c&lB&x&d&4&d&4&d&4&lI&x&c&d&c&d&c&d&lL&x&c&6&c&6&c&6&lI&x&b&f&b&f&b&f&lB&x&b&8&b&8&b&8&lI&x&b&1&b&1&b&1&lL&x&a&a&a&a&a&a&lI", "&x&f&f&f&f&5&5Q&x&e&3&f&f&7&1W&x&c&6&f&f&8&eQ&x&a&a&f&f&a&aT&x&8&e&f&f&c&6E&x&7&1&f&f&e&3C&x&5&5&f&f&f&fH", "");
}
