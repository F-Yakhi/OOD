package service;

public class PaymentService {
    public void paymentService(PaymentMethod paymentMethod, double price) {
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
    }
}
