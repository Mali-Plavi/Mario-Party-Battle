package altitude.source.code.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtil {
	public static void Broadcast(String msg){
		for(Player p : Bukkit.getOnlinePlayers()){
			p.sendMessage(Broadcaster() + msg);
		}
	}
	private static String Broadcaster() {
		return ChatColor.DARK_AQUA + "[Mario Party Battle] " + ChatColor.GOLD;
	}
	
}
