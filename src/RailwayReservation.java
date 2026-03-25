package Assignment;

public class RailwayReservation {
    private int availableTickets = 1;

    synchronized void bookTicket(String passengerName) {
        if (availableTickets > 0) {
            System.out.println(passengerName + ": Ticket booked successfully");
            availableTickets--;
        } else {
            System.out.println(passengerName + ": No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation reservation = new RailwayReservation();

        Thread t1 = new Thread(() -> reservation.bookTicket("Passenger 1"));
        Thread t2 = new Thread(() -> reservation.bookTicket("Passenger 2"));

        t1.start();
        t2.start();
    }
}
