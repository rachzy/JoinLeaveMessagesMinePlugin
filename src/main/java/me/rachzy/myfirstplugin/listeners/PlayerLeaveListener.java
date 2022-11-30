package me.rachzy.myfirstplugin.listeners;

import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeaveListener implements Listener {
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        e.setQuitMessage(String.format("§7[§c-§7] %s", player.getName()));
    }
}
