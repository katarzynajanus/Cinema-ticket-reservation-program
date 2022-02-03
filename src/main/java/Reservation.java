public class Reservation {
    private int id;
    private String surname;
    private String lastname;
    private String movieTitle;
    private String dateOfSeance; // HH:mm dd.MM.yyyy
    private int numberOfReservedSeats;


    public Reservation(int id, String surname, String lastname, String movieTitle, String dateOfSeance, int numberOfReservedSeats) {
        this.id = id;
        this.surname = surname;
        this.lastname = lastname;
        this.movieTitle = movieTitle;
        this.dateOfSeance = dateOfSeance;
        this.numberOfReservedSeats = numberOfReservedSeats;
    }

    public Reservation(){

    }


    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDateOfSeance() {
        return dateOfSeance;
    }

    public int getNumberOfReservedSeats() {
        return numberOfReservedSeats;
    }
}
