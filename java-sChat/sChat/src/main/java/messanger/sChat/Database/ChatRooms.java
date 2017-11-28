package messanger.sChat.Database;

import java.util.HashMap;
import java.util.Map;

import messanger.sChat.model.Rooms;

public class ChatRooms {
	
	private static Map<Long, Rooms> rooms = new HashMap<>();
	

public static Map<Long, Rooms> getChatRooms(){
	return rooms;
}

}