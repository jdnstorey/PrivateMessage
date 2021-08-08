package me.archaenium.chattools;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getPlayer;

public class Message implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        if (sender instanceof Player) {
            if(cmd.getName().equalsIgnoreCase("msg")) {

                Player msgsender = (Player) sender;
                Player msgreciever = getPlayer(args[0]);

                if(args.length == 0){
                    msgsender.sendMessage(ChatColor.RED+ "Insufficient Arguments");
                }

                if(msgreciever != null){
                    String message = "";

                    for (int i = 1; i != args.length; i++){
                        message += args[i] + " ";

                        msgreciever.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "[MSG] " + ChatColor.RESET + ChatColor.RED + "" + msgsender.getName() + ChatColor.BOLD + " > " + ChatColor.RESET + message);
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Player is offline");
                }
            }
        }
        return false;
    }

}
