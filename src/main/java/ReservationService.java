public class ReservationService {
    private ReservationCollection reservationCollection = new ReservationCollection();

/*
    Klasa powinna zawierać funkcjonalności realizowane w ramach systemu rezerwacji sal kinowych:

* dodawanie rezerwacji//
* usuwanie rezerwacji //
* aktualizacja rezerwacji//
* wyświetlanie rezerwacji//

* wyszukiwanie rezerwacji po nazwie seansu//
* sortowanie rezerwacji po dacie
* wyszukiwanie rezerwacji po dacie seansu i nazwie//


    W ramach funkcjonalności dodawania, usuwania, aktualizacji zadbaj o odpowiednią walidację danych
*/

    public void addReservations(int id, String surname, String lastname, String movieTitle, String dateOfSeance, int numberOfReservedSeats) {
        //boolean isValid;
        Reservation reservation = new Reservation(id, surname, lastname, movieTitle, dateOfSeance, numberOfReservedSeats);
        reservationCollection.addReservation(reservation);
    }


    public void removeReservations(int id) {
        reservationCollection.deleteReservation(id);
    }


    public void updateReservation(int id) {
        for (int i = 0; i < reservationCollection.reservations.length; i++) {
            if (reservationCollection.reservations[i] != null && reservationCollection.reservations[i].getId() == id) {
                reservationCollection.reservations[i] = null;
                break;
            }
        }
    }


    public Reservation[] getReservations() {
        return reservationCollection.getReservations();
    }


    public void searchByDateAndTitle(String dateOfSeance, String movieTitle) {
        reservationCollection.searchingForDateAndNameOfSeance(dateOfSeance, movieTitle);
    }


    /*public void sortReservationByDate(boolean isAsc){
        Reservation[] sortReservations = reservationCollection.getReservations();
        int swapCounter;
        do {
            swapCounter = 0;
            for (int j=0;j<sortReservations.length-1;j++){
                if (isAsc && sortReservations[j].getDateOfSeance().equals(sortReservations[j+1].getDateOfSeance())){
                    Reservation tmp = sortReservations[j];
                    sortReservations[j] = sortReservations[j+1];
                    sortReservations[j+1] = tmp;
                    swapCounter++;
                } else if (!isAsc && sortReservations[j].getDateOfSeance().equals(sortReservations[j+1].getDateOfSeance())) {
                    Reservation tmp = sortReservations[j];
                    sortReservations[j] = sortReservations[j+1];
                    sortReservations[j+1] = tmp;
                    swapCounter++;
                }
            }
        }while (swapCounter > 0);
        System.out.println("Lista posortowanych rezerwacji: ");
        for (Reservation reservation: sortReservations) {
            if (reservation == null && reservation.getDateOfSeance().equals()) {
                System.out.printf("Rezerwacja: %d, %s, %s, %s, %s, %d\n",
                        reservation.getId(),
                        reservation.getSurname(),
                        reservation.getLastname(),
                        reservation.getMovieTitle(),
                        reservation.getDateOfSeance(),
                        reservation.getNumberOfReservedSeats());
            }
        }

    }*/
}






