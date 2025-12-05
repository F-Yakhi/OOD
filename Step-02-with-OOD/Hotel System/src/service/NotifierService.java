package service;

import model.Customer;

public class NotifierService {

    public void notifier(Reservation res, Notifier notifier) {
        if (notifier == Notifier.MOBILE) {
            MessageSender messageSender = new SendByMobileNumber();
            messageSender.sendMessage(res.getCustomer().getMobile());
        }else {
            MessageSender messageSender = new SendByEmail();
            messageSender.sendMessage(res.getCustomer().getEmail());
        }
    }
}
