package model;

public abstract class Room {
    private final String number;
    private final String type;
    private final double basePrice;

    public Room(String number, String type, double basePrice){
        this.number = number;
        this.type = type;
        this.basePrice = basePrice;
    }
    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double calculatePrice();
}
