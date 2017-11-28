package messanger.sChat.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import messanger.sChat.Database.ChatRooms;
import messanger.sChat.model.Message;
import messanger.sChat.model.Rooms;

public class ChatRoomService {
	
private Map<Long, Rooms> chatRooms = ChatRooms.getChatRooms();
	

	public ChatRoomService() {
		chatRooms.put(1L, new Rooms(1, "ChatRoom 1", "Shahriar"));
		chatRooms.put(2L, new Rooms(2, "ChatRoom 2", "Joe"));
	}

	public List<Rooms> getAllchatrooms() {
		return new ArrayList<Rooms>(chatRooms.values()); 
		
	}

	public Rooms addRoom(Rooms name) {
		name.setId(chatRooms.size() + 1);
		chatRooms.put(((Rooms) chatRooms).getId(), name);
		return name;

	}

	public Rooms removeChatRoom(long id) {
		// TODO Auto-generated method stu
		return chatRooms.remove(id);
		
	}

	public Rooms getchatroom(long id) {
		Rooms name = chatRooms.get(id);
		if (name == null) {
			return null;
		}
		return name;
	}
	
	
}
