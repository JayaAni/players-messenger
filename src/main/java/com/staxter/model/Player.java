package com.staxter.model;

import java.util.List;

import com.staxter.service.IMessageService;


/**
 * Player model for message service
 * 
 * @author Srinivasa Raju
 *
 */
public class Player {

	private int id;
	private String name;
	private List<String> messageBox;
	private IMessageService messageService;

	public Player(List<String> messageBox, IMessageService messageService) {
		this.messageBox = messageBox;
		this.messageService = messageService;
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMessageBox() {
		return messageBox;
	}

	public void setMessageBox(List<String> messageBox) {
		this.messageBox = messageBox;
	}

	public IMessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(IMessageService messageService) {
		this.messageService = messageService;
	}
}
