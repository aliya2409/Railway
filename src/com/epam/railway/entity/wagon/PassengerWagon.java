package com.epam.railway.entity.wagon;

import com.epam.railway.entity.RailTransport;

public class PassengerWagon extends RailTransport {
    private int seats;
    private static double DEFAULT_WEIGHT = 27.5;
    private static double DEFAULT_PAYLOAD = 63;
    private static int DEFAULT_SEATS = 36;

    public PassengerWagon(double weight, double payload, int seats) {
        super(weight, payload);
        this.seats = seats;
    }

    public PassengerWagon() {
        weight = DEFAULT_WEIGHT;
        payload = DEFAULT_PAYLOAD;
        seats = DEFAULT_SEATS;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public static double getDefaultWeight() {
        return DEFAULT_WEIGHT;
    }

    public static double getDefaultPayload() {
        return DEFAULT_PAYLOAD;
    }

    public static int getDefaultSeats() {
        return DEFAULT_SEATS;
    }

    public static void setDefaultWeight(double defaultWeight) {
        DEFAULT_WEIGHT = defaultWeight;
    }

    public static void setDefaultPayload(double defaultPayload) {
        DEFAULT_PAYLOAD = defaultPayload;
    }

    public static void setDefaultSeats(int defaultSeats) {
        DEFAULT_SEATS = defaultSeats;
    }
}
