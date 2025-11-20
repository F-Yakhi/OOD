package service;

public class PayByCash implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("The hotel fee wich was " + price + " paid");
    }
}
