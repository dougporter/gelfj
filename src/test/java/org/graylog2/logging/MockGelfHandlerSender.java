package org.graylog2.logging;

import org.graylog2.GelfMessage;
import org.graylog2.GelfUDPSender;

import java.io.IOException;

/**
 * @author lkmikkel
 */
public class MockGelfHandlerSender extends GelfUDPSender {
    private static GelfMessage lastMessage;

    public MockGelfHandlerSender() throws IOException {
        super("localhost");
    }

    @Override
    public boolean sendMessage(GelfMessage message) {
        lastMessage = message;
        return true;
    }

    public GelfMessage getLastMessage() {
        return lastMessage;
    }
}
