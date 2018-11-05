package com.epam.railway.entity.wagon;

import com.epam.railway.entity.RailTransport;

public class PassengerWagon extends RailTransport {
    private int seats;

    public PassengerWagon(double weight, double payload, int seats) {
        super(weight, payload);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
