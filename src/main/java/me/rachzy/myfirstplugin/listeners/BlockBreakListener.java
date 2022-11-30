package me.rachzy.myfirstplugin.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
public class BlockBreakListener implements Listener {
    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent e) {
        Player player = e.getPlayer();
        Block block = e.getBlock();
        Material blockType = block.getType();
        String item = player.getItemInHand().getType().toString();

        //Check if the item is either dirt or grass
        if((blockType == Material.GRASS || blockType == Material.DIRT) && !item.endsWith("SPADE")) {
            e.setCancelled(true);
            player.sendMessage("§cYou need a shovel to break this block!");

        }

        if(blockType == Material.STONE && !item.endsWith("PICKAXE")) {
            e.setCancelled(true);
            player.sendMessage("§cYou need a pickaxe to break this block!");
        }

        if(!e.isCancelled()) {
            player.sendMessage(String.format("§eYou've mined 1x %s. You've earned §a$1 §ecash", blockType));
        }
    }
}
