package service;

import model.Customer;
import model.Room;

public class ReservationService {
    public Room room;
    public Customer customer;
    public int nights;

    public ReservationService() {

    }

    public void makeReservation(Reservation res,PaymentMethod paymentMethod, Notifier notifier) {
        double price = res.totalPrice();
        new PaymentService().paymentService(paymentMethod, price);
        new NotifierService().notifier(res, notifier);
    }

}
