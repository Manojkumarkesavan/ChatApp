package com.example.demo.model;

import java.sql.Date;
import java.sql.Timestamp;

public class chatListDTO {

	private int chatId;
	private String name;
	private int chat_receiver_id;
	public int getChat_receiver_id() {
		return chat_receiver_id;
	}
	public void setChat_receiver_id(int chat_receiver_id) {
		this.chat_receiver_id = chat_receiver_id;
	}
	private long time;
	private String lastsentmsg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long l) {
		this.time = l;
	}

	public String getLastsentmsg() {
		return lastsentmsg;
	}
	public void setLastsentmsg(String lastsentmsg) {
		this.lastsentmsg = lastsentmsg;
	}
	public int getChatId() {
		return chatId;
	}
	public void setChatId(int chatId) {
		this.chatId = chatId;
	}
	
}
