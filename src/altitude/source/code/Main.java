package altitude.source.code;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import altitude.source.code.listeners.Listener;
import altitude.source.code.utils.ChatUtil;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new Listener(), this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player p = (Player) sender;
			if(label.equalsIgnoreCase("mpb")){
				if(p.hasPermission("mpb.test")||p.isOp()){
					p.sendMessage("The MPB is working");
				}
			}
			if(label.equalsIgnoreCase("mpbb")){
				if(p.hasPermission("mpb.broadcast")||p.isOp()){
					if(args.length == 1){
						ChatUtil.Broadcast(args[0]);
					}
				}
			}
		return false;
	}
	
}
