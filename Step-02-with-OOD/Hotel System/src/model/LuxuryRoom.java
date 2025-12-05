package model;

public class LuxuryRoom extends Room {
    public LuxuryRoom(String number, double price){
        super(number, "luxury", price);
    }
    public void addFreeDinner(){
        System.out.println("Free dinner added for luxury room " + getNumber());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.5;
    }
}