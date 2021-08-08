package me.archaenium.chattools;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "ChatTools enabled!");

        getServer().getPluginCommand("msg").setExecutor(new Message());

    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "ChatTools disabled");
    }

}
