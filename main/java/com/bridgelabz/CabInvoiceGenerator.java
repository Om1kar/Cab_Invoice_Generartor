package com.bridgelabz;

public class CabInvoiceGenerator {
    private static final double COST_PER_KM = 10.0;
    private static final double COST_PER_MINUTE = 1.0;

    public static double calculateFare(double distance, double time) {

        return distance * COST_PER_KM + time * COST_PER_MINUTE;
    }
    public static void main(String[] args) {
        System.out.println("----------Welcome To Cab Invoice Generator--------");
    }
}
