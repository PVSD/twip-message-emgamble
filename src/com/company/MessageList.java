package com.company;


import java.util.ArrayList;

public class MessageList {
    public static ArrayList conversations;
    //public ArrayList messages;

    public static void addToConversation(String toNum, Message x){
        if (conversations.contains(toNum)){
            ArrayList w = (ArrayList) conversations.get(conversations.indexOf(toNum));
            w.add(x);

        }

    }
    public static void newConversation(Message x){
        ArrayList ary = new ArrayList();
        ary.add(0,x);
        conversations.add(0,ary);

    }

    public static String displayConversation(String toNum){
        StringBuffer sb = new StringBuffer();
        ArrayList y = (ArrayList) conversations.get(conversations.indexOf(toNum));
        for(int i = 0; i < y.size(); i++) {
            Message c = (Message) y.get(i);
            for ( int j = 0; j < y.size(); j++) {
                String textMessage = c.getTextMessage();
                sb.append(textMessage);
                for (int g = 0; g < y.size(); g++) {
                    for (int k = 0; k < y.size(); k++) {
                        String from = c.getFromNumber();
                        sb.append(from);
                    }
                    sb.append(":");
                }
            }
            sb.append("\n");
        }
        String SingleConvo = sb.toString();
        return SingleConvo;


    }

    public static String displayAllConversations(){
        StringBuffer sb = new StringBuffer();
        for(int w = 0; w < conversations.size(); w ++) {
            ArrayList y = (ArrayList) conversations.get(w);
            for (int i = 0; i < y.size(); i++) {
                Message c = (Message) y.get(i);
                for (int j = 0; j < y.size(); j++) {
                    String textMessage = c.getTextMessage();
                    sb.append(textMessage);
                    for (int g = 0; g < y.size(); g++) {
                        for (int k = 0; k < y.size(); k++) {
                            String from = c.getFromNumber();
                            sb.append(from);
                        }
                        sb.append(":");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n \n");

        }
        String allConvos = sb.toString();
        return allConvos;

    }




}
