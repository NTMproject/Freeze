package by.quaks.ntm.events;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import static by.quaks.ntm.main.freeze_team;

public class IventListener implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if(freeze_team.hasPlayer(p)){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onInventory(InventoryOpenEvent e){
        Player p = (Player) e.getPlayer();
        if(freeze_team.hasPlayer(p)){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onDamage(EntityDamageEvent e){
        if(e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            if (freeze_team.hasPlayer(p)) {
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onChat(AsyncChatEvent e){
        Player p = e.getPlayer();
        if(freeze_team.hasPlayer(p)){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onDrop(PlayerDropItemEvent e){
        Player p = e.getPlayer();
        if(freeze_team.hasPlayer(p)){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();
        if(freeze_team.hasPlayer(p)){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        if(freeze_team.hasPlayer(p)){
            e.setCancelled(true);
        }
    }
}
