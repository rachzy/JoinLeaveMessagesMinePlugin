package me.rachzy.myfirstplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        String playerNick = player.getDisplayName();

        System.out.println(String.format("§bA new player §7[%s] §bhas joined!", playerNick));
        e.setJoinMessage(String.format("§7[§a+§7] %s", playerNick));

        if(player.hasPlayedBefore()) {
            player.sendMessage(String.format("§eWelcome back, §a%s§e! We missed yah!", playerNick));
        } else {
            player.sendMessage(String.format("§eWelcome, §a%s, §eto my server! This is your first time in my server!", playerNick));
        }
    }
}
