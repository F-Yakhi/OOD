package service;

public class PayByPaypal implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("The hotel fee wich was " + price + " paid");
    }
}
