package com.company;

import java.time.Clock;

public class Message {
    public String fromNumber;
    public String toNumber;
    public String textMessage;
    //public Clock clock;
    //public long time;
    public Message(String num, String t, String b){
        fromNumber = num;
        toNumber = b;
        textMessage = t;
        //time = clock.millis();
    }
    public String getFromNumber(){
        return fromNumber;
    }

    public String getTextMessage() {
        return textMessage;
    }
}
