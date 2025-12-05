package service;

public class SendByMobileNumber implements MessageSender {
    public void sendMessage(String mobile){
        System.out.println("Your room is reserved, Enjoy your trip!");
    }
}
