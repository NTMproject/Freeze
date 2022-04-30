package by.quaks.ntm.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import static by.quaks.ntm.main.freeze_team;

public class Freeze implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (Bukkit.getOfflinePlayer(args[0]).isOnline()){
            if(freeze_team.hasPlayer(Bukkit.getOfflinePlayer(args[0]))){
                freeze_team.addPlayer(Bukkit.getOfflinePlayer(args[0]));
            }else{
                freeze_team.removePlayer(Bukkit.getOfflinePlayer(args[0]));
            }
        }
        return true;
    }
}
