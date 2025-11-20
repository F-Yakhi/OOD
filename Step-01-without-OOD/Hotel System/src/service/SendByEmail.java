package service;

public class SendByEmail implements MessageSender {
    public void sendMessage(String email){
        System.out.println("Your room is reserved, Enjoy your trip!");
    }
}
