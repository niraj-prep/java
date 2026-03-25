package Assignment;

abstract class Ride {
    protected double distance;

    public Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    public void displayFare() {
        System.out.println("  Distance: " + distance + " km | Fare: Rs. " + calculateFare());
    }
}

class BikeRide extends Ride {
    public BikeRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    public AutoRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    public CarRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12;
    }
}

public class RideBookingDemo {
    public static void main(String[] args) {
        System.out.println("=== Ride Booking Application ===\n");

        Ride[] rides = {
            new BikeRide(10),
            new AutoRide(10),
            new CarRide(10),
            new BikeRide(25),
            new CarRide(5)
        };

        String[] labels = {"Bike Ride", "Auto Ride", "Car Ride", "Bike Ride", "Car Ride"};

        for (int i = 0; i < rides.length; i++) {
            System.out.println(labels[i] + ":");
            rides[i].displayFare();
        }
    }
}
