package com.staxter.service;

import com.staxter.exception.MessageException;
import com.staxter.model.Player;


/**
 * This is for sending message to player
 * 
 * @author Srinivasa Raju
 *
 */
public class MessageService implements IMessageService {
	private int count = 1;
	private String ack = null;

	public String send(String message, Player receiver) throws MessageException {

		if (count > 10) {
			throw new MessageException("Message Limit 10 ..crossed");
		} else {
			receiver.getMessageBox().add(message);
		}
		ack = message + count;
		++count;
		return ack;
	}

}
