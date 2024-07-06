package me.abab.QWQTECH.Task;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.abab.QWQTECH.utils.Items;
import me.abab.QWQTECH.utils.QWQUtils;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class QWQTECHItemRegister {
    public static String colorize(String string) {
        Pattern pattern = Pattern.compile("#[a-fA-F0-9]{6}");
        for (Matcher matcher = pattern.matcher(string); matcher.find(); matcher = pattern.matcher(string)) {
            String color = string.substring(matcher.start(), matcher.end());
            string = string.replace(color, net.md_5.bungee.api.ChatColor.of(color) + ""); // You're missing this replacing
        }
        string = ChatColor.translateAlternateColorCodes('&', string); // Translates any & codes too
        return string;
    }
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
                        e.getPlayer().sendMessage(colorize("&x&f&f&5&5&f&f欸&x&f&9&5&b&f&f?&x&f&2&6&2&f&f.&x&e&c&6&8&f&f.&x&e&6&6&e&f&f.&x&e&0&7&4&f&f.&x&d&9&7&b&f&f.&x&d&3&8&1&f&f.&x&c&d&8&7&f&f伤&x&c&6&8&e&f&f害&x&c&0&9&4&f&f被&x&b&a&9&a&f&f鼠&x&b&3&a&1&f&f鼠&x&a&d&a&7&f&f吞&x&a&7&a&d&f&f了&x&a&1&b&3&f&f?&x&9&a&b&a&f&f再&x&9&4&c&0&f&f也&x&8&e&c&6&f&f不&x&8&7&c&d&f&f给&x&8&1&d&3&f&f鼠&x&7&b&d&9&f&f鼠&x&7&4&e&0&f&f充&x&6&e&e&6&f&f钱&x&6&8&e&c&f&f了&x&6&2&f&2&f&fq&x&5&b&f&9&f&fw&x&5&5&f&f&f&fq"));
                    }
                }
            });

            ItemStack[] HuZT0pre_qwq = new ItemStack[]{null, null, null, null, null, null, null, null, null};
            QWQUtils.registerItem("QWQ_HUZTOPRE_QWQ", Items.QWQ_HUZTOPRE_QWQ, Items.QWQTECH_SNAKE, RecipeType.NULL, HuZT0pre_qwq);
            ItemStack[] DeviIGugY = new ItemStack[]{null, null, null, null, null, null, null, null, null};
            QWQUtils.registerItem("QWQ_DEV_DASHE", Items.QWQ_DEV_DASHE, Items.QWQTECH_SNAKE, RecipeType.NULL, DeviIGugY);
            ItemStack[] KaleineXD = new ItemStack[]{null, null, null, null, null, null, null, null, null};
            QWQUtils.registerItem("QWQ_KALEINEXD_DASHE", Items.QWQ_KALEINEXD_DASHE, Items.QWQTECH_SNAKE, RecipeType.NULL, KaleineXD);



        }
    }
