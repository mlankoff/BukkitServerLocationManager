package me.men8.manager.player;

import me.men8.manager.main.Main;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoin implements Listener{
	
	public Main plugin;
	
	public PlayerJoin(Main plug){
		this.plugin = plug;
	}
	
	@EventHandler
	public static void onPlayerJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		World w = p.getWorld();
		double x = Main.config.getDouble("Server." + "Spawn_data." + "X");
		double y = Main.config.getDouble("Server." + "Spawn_data." + "Y");
		double z = Main.config.getDouble("Server." + "Spawn_data." + "Z");
		Location spawn = new Location(w, x, y, z);
		p.teleport(spawn);
		e.setJoinMessage(null);
	}
	
	@EventHandler
	public static void onPlayerExit(PlayerQuitEvent e){
		e.setQuitMessage(null);
	}

}
