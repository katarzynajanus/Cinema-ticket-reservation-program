public class ReservationCollection {
    public static Reservation[] reservations = new Reservation[10];


    public void addReservation(Reservation reservation) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                reservations[i] = reservation;
                break;
            }
        }
    }

    public void deleteReservation(int id) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] != null && reservations[i].getId() == id) {
                reservations[i] = null;
                break;
            }
        }
    }

    public Reservation[] getReservations() {
        return reservations;
    }


    public void searchingForDateAndNameOfSeance(String dateOfSeance, String movieTitle) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] != null && reservations[i].getDateOfSeance() == dateOfSeance && reservations[i].getMovieTitle() == movieTitle) {
                System.out.println(reservations[i]);
                break;
            }
        }
    }
}







