import model.Customer;
import model.LuxuryRoom;
import model.Room;
import service.Notifier;
import service.PaymentMethod;
import service.Reservation;
import service.ReservationService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
        Room room = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(room, customer, 2);
        ReservationService service = new ReservationService();
        service.makeReservation(res, PaymentMethod.PAYPAL, Notifier.EMAIL);
    }
}
