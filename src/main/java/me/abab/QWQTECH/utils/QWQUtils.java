package me.abab.QWQTECH.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import me.abab.QWQTECH.QWQTECH;
import org.bukkit.inventory.ItemStack;

public class QWQUtils {

    public static void registerItem(String id, ItemStack item, ItemGroup itemGroup, RecipeType recipeType, ItemStack[] recipe) {
        SlimefunItemStack slimefunItemStack = new SlimefunItemStack(id, item);
        SlimefunItem slimefunItem = new SlimefunItem(itemGroup, slimefunItemStack, recipeType, recipe);
        slimefunItem.register(QWQTECH.getInstance());
    }

}
