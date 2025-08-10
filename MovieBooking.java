public class MovieBooking {
    public static void main(String[] args) {
        String movieName = "Natha da leo";
        int ticketsBooked = 6;
        double ticketPrice = 250.0; 
        double totalCost = ticketsBooked * ticketPrice;
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets Booked: " + ticketsBooked);
        System.out.println("Total Cost: Rs." + totalCost);
    }
}