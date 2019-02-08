package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner act = new Scanner(System.in);
        Scanner phoneNum = new Scanner(System.in);
        Scanner phoneNum2 = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        Scanner printOutOption = new Scanner(System.in);
        int x = 0;
       while (x != 3) {
           System.out.println("Enter the number of which action would you like to perform");
           System.out.println("1: Start a conversation. \n 2: Reply to a text \n 3: Exit");
           x = act.nextInt();
           if (x == 1){
               System.out.println("What is your number?");
               String number = phoneNum.next();
               System.out.println("Enter the text message you would like to send.");
               String textMessage = text.next();
               System.out.println("Enter the number of the person you are sending it to.");
               String receiver = phoneNum2.next();
               Message a = new Message(number, textMessage, receiver);
               MessageList b = new MessageList(a);
               b.newConversation(a);
               System.out.println("Press 1 to see this conversation. Press 2 to see all conversations");
               int next = printOutOption.nextInt();
               if (next == 1){
                   System.out.println(b.displayConversation(receiver));
               }
               if (next == 2){
                   System.out.println(b.displayAllConversations());
               }


           }
           else if (x == 2){
               System.out.println("What is your number?");
               String number = phoneNum.next();
               System.out.println("Enter the text message you would like to send.");
               String textMessage = text.next();
               System.out.println("Enter the number of the person you are sending it to.");
               String receiver = phoneNum2.next();
               Message a = new Message(number, textMessage, receiver);
               MessageList b = new MessageList(a);
               b.addToConversation(receiver, a);
               System.out.println("Press 1 to see this conversation. Press 2 to see all conversations");
               int next = printOutOption.nextInt();
               if (next == 1){
                   System.out.println(b.displayConversation(receiver));
               }
               if (next == 2){
                   System.out.println(b.displayAllConversations());
               }

           }
       }


    }
}
