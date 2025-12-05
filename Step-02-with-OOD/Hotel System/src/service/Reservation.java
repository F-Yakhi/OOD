package service;

import model.Customer;
import model.Room;

public class Reservation {
    private final Room room;
    private final Customer customer;
    private final int nights;

    public Reservation(Room r, Customer c, int nights) {
        this.room = r;
        this.customer = c;
        this.nights = nights;
    }

    public double totalPrice(){
        return room.calculatePrice() * nights;
    }

    public Room getRoom() {
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getNights() {
        return nights;
    }
}
