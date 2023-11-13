public class CinemaTicket {
    
    static String cinemaName = "Cinema City";
    String title;
    int row;
    int seat;
    float price;

    public CinemaTicket(String title, int row, int seat) {
        this.title=title;
        this.row= row;
        this.seat=seat;
        if(row<=2) {
            this.price = 10.00f;
        }else{
            this.price = 25.00f;
        }

    }

    public String displayTicket() {
        return "Cinema Name: " + cinemaName +"\nFilm Title: " + title +"\nRow: " + row + " Seat: " + seat +"\nPrice: PLN " + price;
    }

    public static void main(String[] args) {
        // Create two CinemaTicket objects
        CinemaTicket t1 = new CinemaTicket("Gladiator", 2, 5);
        CinemaTicket t2 = new CinemaTicket("Gladiator", 7, 3);

        // Display created ticket details
        System.out.println("Ticket 1 Details:\n" + t1.displayTicket());
        System.out.println("\nTicket 2 Details:\n" + t2.displayTicket());
    }
}
