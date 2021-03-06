package messanger.sChat.service;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import messanger.sChat.Database.DatabaseClass;
//import messanger.sChat.messenger.exception.DataNotFoundException;
import messanger.sChat.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "this is the first thing i wrote", "shahriar", "Chatroom1"));
		messages.put(2L, new Message(2, "Hello man", "Jo", "Chatroom 2") );
		messages.put(3L, new Message(3, "This is soe", "Joes", "Chatroom 2") );
		messages.put(4L, new Message(4, "This is the best messaging app ever", "Joye", "Chatroom 2") );
		
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
	
	

	
	public Message getMessage(long id) {
		Message message = messages.get(id);
		if (message == null) {
			return null;
		}
		return message;
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}

	public List<Message>  getAllChatRoom() {
		return new ArrayList<Message>(messages.values()); 
	}

	
	public Message getRoomName(Long id) {
		Message message = messages.get(id);
		if (message == null) {
			return null;
		}
		return message;
	}
	
	public Message addChatRoom(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeChatRoom(long id) {
		return messages.remove(id);
	}

	


	
	
	
}