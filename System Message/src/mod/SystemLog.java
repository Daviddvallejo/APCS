package mod;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;
import java.util.Random;

public class SystemLog {
	//creates an arrayList of messages
	public static final ArrayList<LogMessage> messageList = new ArrayList<LogMessage>();
	//adds a message to the arrayList
	public void addMessage(LogMessage userMessage){
		messageList.add(userMessage);
	}
	//prints the arrayList
	public String printList(){
		ArrayList<String> list = new ArrayList<String>();

		for (LogMessage logMessage : messageList) {
			list.add(logMessage.getMachineId() + ":" + logMessage.getDescription());
		}

		return String.join("\n", list);
	}
	//creates a List of messages ordered by Id and returns it
	public ArrayList<LogMessage> getMessagesById(String machineId) {
		ArrayList<LogMessage> messages = new ArrayList<LogMessage>();
		for (LogMessage message : messageList) {
			if (machineId.equalsIgnoreCase(message.getMachineId())) messages.add(message);
		}
		return messages;
	}
	//prints the List
	public String printList2(ArrayList<LogMessage> input){
		ArrayList<String> list = new ArrayList<String>();

		for (LogMessage logMessage : input) {
			list.add(logMessage.getMachineId() + ":" + logMessage.getDescription());
		}

		return String.join("\n", list);
	}

	//gets the messages containing a sspecified keyword
	public ArrayList<LogMessage> getMessagesByKeyword(String keyword) {
		ArrayList<LogMessage> messages = new ArrayList<LogMessage>();
		for (LogMessage message : messageList) {
			if (message.getDescription().toLowerCase().contains(keyword.toLowerCase())) messages.add(message);
		}
		return messages;
	}
	//removes all messages with a certain ID
	public void removeMessagesById(String machineId) {
		ArrayList<LogMessage> filteredMessages = getMessagesById(machineId.toLowerCase());
		messageList.removeAll(filteredMessages);
	}
	//removes all messages with a certain keyword
	public void removeMessagesByKeyword(String keyword) {
		ArrayList<LogMessage> filteredMessages = getMessagesByKeyword(keyword.toLowerCase());
		messageList.removeAll(filteredMessages);
	}
	//generates a random description with an ID
	public String generateRandomDescriptionById(String machineId) {
		Random random = new Random();
		return messageList.get(random.nextInt(messageList.size())).getDescription();
	}
	
	public int getCount(String machineId) {
		return getMessagesById(machineId).size();
	}
	//creates a hashMap of the messages and returns it
	public HashMap<LogMessage, Integer> getMessageCountMap() {
		HashMap<LogMessage, Integer> map = new HashMap<LogMessage, Integer>();
		for(LogMessage message : messageList){
			map.put(message, getMessagesById(message.getMachineId()).size());
		}
		return map;
	}
}

