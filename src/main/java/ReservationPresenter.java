import java.util.Scanner;

public class ReservationPresenter {
    private ReservationService reservationService = new ReservationService();


    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Wybierz opcję: \n" +
                    "1. Dodawanie rezerwacji\n" +
                    "2. Usuwanie rezerwacji\n" +
                    "3. Aktualizacja rezerwacji\n" +
                    "4. Wyświetlanie rezerwacji\n" +
                    "5. Wyszukiwanie rezerwacji po nazwie seansu\n" +
                    "6. Sortowanie rezerwacji po dacie\n" +
                    "7. Wyszukiwanie rezerwacji po dacie i nazwie seansu");


            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    insertReservationOnTheList();
                    break;
                case 2:
                    deleteReservationFromTheList();
                    break;
                case 3:
                    updateReservationFromTheList();
                    break;
                case 4:
                    getReservationsList();
                    break;
                case 5:
                    searchByTitleFromTheList();
                    break;
                case 6:
                    //sortTheReservationsByDate();
                    break;
                case 7:
                    searchByDateAndTitleFromTheList();
                    break;
                default:
                    System.out.println("Została wybrana niedostępna opcja");

            }

        } while (true);
    }


    public void insertReservationOnTheList() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id (0-200):");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj swoje imię: ");
        String surname = scanner.nextLine();

        System.out.println("Podaj swoje nazwisko: ");
        String lastname = scanner.nextLine();

        System.out.println("Podaj tytuł filmu: ");
        String movieTitle = scanner.nextLine();

        System.out.println("Podaj datę seansu (w formacie:HH:mm dd.MM.yyyy): ");
        String dateOfSeance = scanner.nextLine();

        System.out.println("Podaj numer miejsca: ");
        int numberOfReservedSeats = scanner.nextInt();

        reservationService.addReservations(id, surname, lastname, movieTitle, dateOfSeance, numberOfReservedSeats);

    }

    public void deleteReservationFromTheList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id (0-200): ");
        int id = scanner.nextInt();
        scanner.nextLine();
        reservationService.removeReservations(id);
    }

    public void updateReservationFromTheList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id (0-200): ");
        int id = scanner.nextInt();
        scanner.nextLine();
        reservationService.updateReservation(id);
        insertReservationOnTheList();
    }

    public void getReservationsList() {
        System.out.println("Lista rezerwacji: ");
        for (Reservation reservation : reservationService.getReservations()) {
            if (reservation != null) {
                System.out.printf("Rezerwacja: %d, %s, %s, %s, %s, %d\n",
                        reservation.getId(),
                        reservation.getSurname(),
                        reservation.getLastname(),
                        reservation.getMovieTitle(),
                        reservation.getDateOfSeance(),
                        reservation.getNumberOfReservedSeats());
            }
        }
    }

    public void searchByTitleFromTheList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł filmu: ");
        String movieTitle = scanner.nextLine();
        for (Reservation reservation : reservationService.getReservations()) {
            if (reservation != null && reservation.getMovieTitle().equals(movieTitle)) {
                System.out.printf("Rezerwacja: %d, %s, %s, %s, %s, %d\n",
                        reservation.getId(),
                        reservation.getSurname(),
                        reservation.getLastname(),
                        reservation.getMovieTitle(),
                        reservation.getDateOfSeance(),
                        reservation.getNumberOfReservedSeats());
            }
        }
    }

    /*public void sortTheReservationsByDate() {
        System.out.println("Lista rezerwacji posortowana po dacie seansu: ");
        for (Reservation reservation : reservationService.getReservations()) {
            if (reservation != null) {
                System.out.printf("Rezerwacja: %d, %s, %s, %s, %s, %d\n",
                        reservation.getId(),
                        reservation.getSurname(),
                        reservation.getLastname(),
                        reservation.getMovieTitle(),
                        reservation.getDateOfSeance(),
                        reservation.getNumberOfReservedSeats());
            }
        }*/
        //reservationService.sortByDate();



    public void searchByDateAndTitleFromTheList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł filmu: ");
        String movieTitle = scanner.nextLine();
        System.out.println("Podaj datę seansu (w formacie:HH:mm dd.MM.yyyy): ");
        String dateOfSeance = scanner.nextLine();
        for (Reservation reservation : reservationService.getReservations()) {
            if (reservation != null && reservation.getMovieTitle().equals(movieTitle) && reservation.getDateOfSeance().equals(dateOfSeance)) {
                System.out.printf("Rezerwacja: %d, %s, %s, %s, %s, %d\n",
                        reservation.getId(),
                        reservation.getSurname(),
                        reservation.getLastname(),
                        reservation.getMovieTitle(),
                        reservation.getDateOfSeance(),
                        reservation.getNumberOfReservedSeats());
            }
        }

    }


}