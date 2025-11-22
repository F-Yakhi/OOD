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
        if (paymentMethod == PaymentMethod.PAYPAL) {
            Payment payment = new PayByPaypal();
            payment.pay(price);
        } else if (paymentMethod == PaymentMethod.CASH) {
            Payment payment = new PayByCash();
            payment.pay(price);
        }else{
            Payment payment = new PayByCard();
            payment.pay(price);
        }

        if (notifier == Notifier.MOBILE) {
            MessageSender messageSender = new SendByMobileNumber();
            messageSender.sendMessage(res.customer.mobile);
        }else {
            MessageSender messageSender = new SendByEmail();
            messageSender.sendMessage(res.customer.email);        }
    }

}
