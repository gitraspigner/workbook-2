package com.pluralsight.oop;

import java.time.LocalDate;
import java.time.format.TextStyle;

/**
 * Models a simple SMS message.
 *
 * @author Ravi Spigner
 */
public class TextMessage {
    private String senderNumber;
    private String receiverNumber;
    private String body;
    private LocalDate sentOn;

    public TextMessage() {
        senderNumber = "";
        receiverNumber = "";
        body = "";
        sentOn = LocalDate.now(); //could have been null, but this is better so there's a value
    }

    public TextMessage(String senderNumber, String receiverNumber, String body, LocalDate sentOn) {
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.body = body;
        this.sentOn = sentOn;
    }

    public String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        if (body == null || body.isEmpty()) {
            this.body = "--empty--";
        }
        this.body = body;
    }

    public LocalDate getSentOn() {
        return sentOn;
    }

    public void setSentOn(LocalDate sentOn) {
        this.sentOn = sentOn;
    }
}
