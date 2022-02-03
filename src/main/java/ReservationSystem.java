import java.text.ParseException;

public class ReservationSystem {
    public static void main(String[] args) throws ParseException {
        ReservationPresenter reservationPresenter = new ReservationPresenter();
        ReservationService reservationService = new ReservationService();
        reservationService.addReservations(1, "Kasia", "Janus", "Matrix", "12:30 14.07.2010", 32);
        reservationService.addReservations(2, "Mateusz", "Janus", "Harry Potter", "10:30 05.10.2015", 13);
        reservationService.addReservations(3, "Asia", "Bart", "Harry Potter", "13:30 05.10.2015", 3);


        reservationPresenter.showMenu();

    }
}
