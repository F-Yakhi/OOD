package model;

public class NormalRoom extends Room {
    public NormalRoom(String number, double basePrice){
        super(number, "normal", basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice();
    }
}