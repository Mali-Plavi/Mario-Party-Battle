package altitude.source.code;

import org.bukkit.plugin.java.JavaPlugin;

import altitude.source.code.listeners.Listener;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new Listener(), this);
	}
	
}
