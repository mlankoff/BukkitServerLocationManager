package me.men8.manager.config;

import me.men8.manager.main.Main;

public class ServerConfig {
	
	Main plugin;
	
	public ServerConfig(Main plug){
		this.plugin = plug;
	}
	
	public static void createConfig(){
		
		Main.config.set("Version." + "config_version", 1.0);
		
		Main.config.set("Server." + "Spawn_data." + "X", 1);
		Main.config.set("Server." + "Spawn_data." + "Y", 1);
		Main.config.set("Server." + "Spawn_data." + "Z", 1);
		
		Main.config.saveConfig();
	}

}
