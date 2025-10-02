package com.pluralsight.oop;

import java.time.LocalDate;

/**
 * Test program for TextMessage to test its functions and uses.
 *
 * @author Ravi Spigner
 */
public class TextMessageApp {
    public static void main(String[] args) {
        TextMessage text1 = new TextMessage();
        text1.setSenderNumber("+31611111111");
        text1.setReceiverNumber("+31622222222");
        text1.setBody("On my way!");
        //even though this is redundant because of default constructor / empty constructor
        text1.setSentOn(LocalDate.now());
        display(text1);
        System.out.println();
        TextMessage text2 = new TextMessage("+31622222222", "+31611111111",
                "Ok, see you soon!", LocalDate.now());
        display(text2);
    }

    public static void display(TextMessage textMessage) {
        System.out.println(textMessage.getSentOn()+" SMS from " + textMessage.getSenderNumber() +
                " to " + textMessage.getReceiverNumber() + ": " + textMessage.getBody());
    }
}
