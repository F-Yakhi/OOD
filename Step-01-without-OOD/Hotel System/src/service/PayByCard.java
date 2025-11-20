package service;

public class PayByCard implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("The hotel fee wich was " + price + " paid");
    }
}
