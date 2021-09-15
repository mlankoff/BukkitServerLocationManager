package me.men8.manager.main;

import me.men8.manager.config.MyConfig;
import me.men8.manager.config.MyConfigManager;
import me.men8.manager.config.ServerConfig;
import me.men8.manager.player.PlayerJoin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public Main plugin;
	PluginManager pm = Bukkit.getServer().getPluginManager();
	
	public MyConfigManager manager;
	public static MyConfig config;
	
	PlayerJoin playerJoin = new PlayerJoin(this);
	
	public void getPlugin(Main plug){
		this.plugin = plug;
	}
	
	@Override
	public void onEnable(){
		
		
		manager = new MyConfigManager(this);
		
		config = manager.getNewConfig("config.yml");
		if(!config.contains("Version." + "config_version")){
			ServerConfig.createConfig();
		}
		
		pm.registerEvents(this.playerJoin, this);
		
	}
	
	@Override
	public void onDisable(){
		
	}

}
