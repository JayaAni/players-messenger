package com.staxter.service;

import com.staxter.exception.MessageException;
import com.staxter.model.Player;


/**
 * @author Srinivasa Raju
 *
 */
public interface IMessageService {

    String message = null;
    public String send(String message, Player receiver) throws MessageException;
}
