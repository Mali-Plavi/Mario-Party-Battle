package altitude.source.code.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtil {
	public void Brodcast(String msg){
		for(Player p : Bukkit.getOnlinePlayers()){
			p.sendMessage(Brodcaster() + msg);
		}
		
	}
	
	private String Brodcaster() {
		return ChatColor.DARK_AQUA + "[Mario Party Battle] " + ChatColor.GOLD;
	}
	
}
