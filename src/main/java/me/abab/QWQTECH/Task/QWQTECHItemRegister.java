package me.abab.QWQTECH.Task;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.abab.QWQTECH.utils.Items;
import me.abab.QWQTECH.utils.QWQUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


    public class QWQTECHItemRegister {
        public static void run() {
            ItemStack[] qwqDowel = new ItemStack[]{SlimefunItems.ENERGY_CONNECTOR, new ItemStack(Material.IRON_INGOT), SlimefunItems.ENERGY_CONNECTOR, new ItemStack(Material.IRON_INGOT), new ItemStack(Material.REDSTONE), new ItemStack(Material.IRON_INGOT), SlimefunItems.ENERGY_CONNECTOR, new ItemStack(Material.IRON_INGOT), SlimefunItems.ENERGY_CONNECTOR};
            QWQUtils.registerItem("QWQ_DOWEL", Items.QWQ_DOWEL, Items.QWQTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, qwqDowel);
            ItemStack[] qwqDowelplus = new ItemStack[]{SlimefunItems.STEEL_INGOT, Items.QWQ_DOWEL, SlimefunItems.STEEL_INGOT, Items.QWQ_DOWEL, SlimefunItems.CARBON, Items.QWQ_DOWEL, SlimefunItems.STEEL_INGOT, Items.QWQ_DOWEL, SlimefunItems.STEEL_INGOT};
            QWQUtils.registerItem("QWQ_DOWEL_PLUS", Items.QWQ_DOWEL_PLUS, Items.QWQTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, qwqDowelplus);


            ItemStack[] qwqBilipink = new ItemStack[]{Items.QWQ_DOWEL, new ItemStack(Material.PINK_WOOL), Items.QWQ_DOWEL, new ItemStack(Material.PINK_WOOL), SlimefunItems.ENERGY_CONNECTOR, new ItemStack(Material.PINK_WOOL), Items.QWQ_DOWEL, new ItemStack(Material.PINK_WOOL), Items.QWQ_DOWEL};
            QWQUtils.registerItem("QWQ_BILIBILI_PINK", Items.QWQ_BILIBILI_PINK, Items.QWQTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, qwqBilipink);

            ItemStack[] qwqBiliblue = new ItemStack[]{Items.QWQ_DOWEL, new ItemStack(Material.BLUE_WOOL), Items.QWQ_DOWEL, new ItemStack(Material.BLUE_WOOL), SlimefunItems.ENERGY_CONNECTOR, new ItemStack(Material.BLUE_WOOL), Items.QWQ_DOWEL, new ItemStack(Material.BLUE_WOOL), Items.QWQ_DOWEL};
            QWQUtils.registerItem("QWQ_BILIBILI_BLUE", Items.QWQ_BILIBILI_BLUE, Items.QWQTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, qwqBiliblue);

            ItemStack[] qwqBili = new ItemStack[]{null, Items.QWQ_BILIBILI_BLUE, null, Items.QWQ_BILIBILI_PINK, Items.QWQ_DOWEL_PLUS, Items.QWQ_BILIBILI_PINK, null, Items.QWQ_BILIBILI_BLUE, null};
            QWQUtils.registerItem("QWQ_BILIBILI", Items.QWQ_BILIBILI, Items.QWQTECH_ITEM,RecipeType.ENHANCED_CRAFTING_TABLE, qwqBili);
        }
    }
