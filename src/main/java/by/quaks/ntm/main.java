package by.quaks.ntm;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.NameTagVisibility;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class main extends JavaPlugin {
    public static Scoreboard scoreboard;
    public static Team freeze_team;
    @Override
    public void onEnable() {
        scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        freeze_team = scoreboard.registerNewTeam("freeze_tag");
        freeze_team.setNameTagVisibility(NameTagVisibility.NEVER);
        freeze_team.setCanSeeFriendlyInvisibles(false);
    }
    @Override
    public void onDisable() {

    }
}
