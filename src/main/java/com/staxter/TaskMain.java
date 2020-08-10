package com.staxter;

import java.util.ArrayList;
import java.util.List;

import com.staxter.exception.MessageException;
import com.staxter.model.Player;
import com.staxter.service.IMessageService;
import com.staxter.service.MessageService;


/**
 * @author Srinivasa Raju
 *
 */
public class TaskMain {

	public static void main(String[] args) throws MessageException {
		// messageBox for storing messages for Player
		List<String> initiatorMsgBox = new ArrayList<>();
		List<String> receiverMsgBox = new ArrayList<>();

		// messageService component to send messages to other Player (Receiver)
		IMessageService messageService = new MessageService();

		// Players - initiator and receiver
		Player initiator = new Player(initiatorMsgBox, messageService);
		initiator.setId(1);
		initiator.setName("Player_1");
		Player receiver = new Player(receiverMsgBox, messageService);
		receiver.setId(2);
		receiver.setName("Player_2");

		try {
			for (int i = 1; i <= 15; i++) {
				String ackMessage = initiator.getMessageService().send("Started playing the game ", receiver);
				initiator.getMessageBox().add(ackMessage);
			}
		} catch (MessageException e) {
			System.out.println("Players message boxes were reached 10 messages limit");
		}
		System.out.println("--------------------------------"+"Sender Messages"+"--------------------------------");
		for (String receivedMsg : initiator.getMessageBox()) {
			System.out.println(initiator.getName() + " acknowledgement " + receivedMsg);
		}
		System.out.println("--------------------------------"+"Receiver Messages"+"--------------------------------");
		for (String msg : receiver.getMessageBox()) {
			System.out.println(receiver.getName() + " received message=" + msg);
		}
		

	}
}
