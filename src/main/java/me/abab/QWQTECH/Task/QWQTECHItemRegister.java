package me.abab.QWQTECH.Task;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.abab.QWQTECH.utils.Items;
import me.abab.QWQTECH.utils.QWQUtils;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
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
            QWQUtils.registerItem("QWQ_BILIBILI", Items.QWQ_BILIBILI, Items.QWQTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, qwqBili, new ItemUseHandler() {
                public void onRightClick(PlayerRightClickEvent e) {
                    if (e.getClickedBlock().isPresent()) {
                        Block block = (Block) e.getClickedBlock().get();
                        World world = block.getWorld();
                        Location location = block.getLocation();
                        world.strikeLightningEffect(location);
                        e.getPlayer().sendMessage("&x&5&5&f&f&f&f欸&x&5&a&f&a&f&f.&x&5&e&f&6&f&f.&x&6&3&f&1&f&f.&x&6&8&e&c&f&f怎&x&6&d&e&7&f&f么&x&7&1&e&3&f&f没&x&7&6&d&e&f&f伤&x&7&b&d&9&f&f害&x&8&0&d&4&f&f?&x&8&4&d&0&f&f.&x&8&9&c&b&f&f.&x&8&e&c&6&f&f.&x&9&2&c&2&f&f啊&x&9&7&b&d&f&f,&x&9&c&b&8&f&f是&x&a&1&b&3&f&f鼠&x&a&5&a&f&f&f鼠&x&a&a&a&a&f&f把&x&a&f&a&5&f&f伤&x&b&3&a&1&f&f害&x&b&8&9&c&f&f屯&x&b&d&9&7&f&f了&x&c&2&9&2&f&f啊&x&c&6&8&e&f&f,&x&c&b&8&9&f&f再&x&d&0&8&4&f&f也&x&d&4&8&0&f&f不&x&d&9&7&b&f&f给&x&d&e&7&6&f&f鼠&x&e&3&7&1&f&f鼠&x&e&7&6&d&f&f充&x&e&c&6&8&f&f钱&x&f&1&6&3&f&f了&x&f&6&5&e&f&fq&x&f&a&5&a&f&fw&x&f&f&5&5&f&fq");
                    }
                }
            });


        }
    }
