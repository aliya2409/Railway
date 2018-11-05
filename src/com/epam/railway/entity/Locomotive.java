package com.epam.railway.entity;

public class Locomotive extends RailTransport {
    private double power;

    public Locomotive(double weight, double payload, double power) {
        super(weight, payload);
        this.power = power;
    }

    public Locomotive() {
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
