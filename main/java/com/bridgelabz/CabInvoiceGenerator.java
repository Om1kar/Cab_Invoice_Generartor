package com.bridgelabz;

public class CabInvoiceGenerator {
    private static final double COST_PER_KM = 10.0;
    private static final double COST_PER_MINUTE = 1.0;

    public static double calculateFare(double distance, double time) {

        return distance * COST_PER_KM + time * COST_PER_MINUTE;
    }

    public static double getTotalFare(Ride[] rides) {
        double aggregateFare = 0;
        for (Ride ride : rides) {
            double totalFare = getTotalFare(ride.distance, ride.time);
            aggregateFare += totalFare;
        }
        return aggregateFare;
    }

    private static double getTotalFare(double distance, double time) {
        return distance * COST_PER_KM + time * COST_PER_MINUTE;

    }
    public static Invoice InvoiceOfRides(Ride[] rides) {
        int numberOfRides = rides.length;
        double totalFare = getTotalFare(rides);
        double averageRideFare = totalFare/numberOfRides;
        return new Invoice(numberOfRides,totalFare,averageRideFare);
    }
}
