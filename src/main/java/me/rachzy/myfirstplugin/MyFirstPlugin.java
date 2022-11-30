package me.rachzy.myfirstplugin;

import me.rachzy.myfirstplugin.listeners.BlockBreakListener;
import me.rachzy.myfirstplugin.listeners.PlayerJoinListener;
import me.rachzy.myfirstplugin.listeners.PlayerLeaveListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World!");

        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Stopping plugin");
    }
}
