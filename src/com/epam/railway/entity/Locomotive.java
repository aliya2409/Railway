package com.epam.railway.entity;

public class Locomotive extends RailTransport {
    private double power;
    private static double DEFAULT_POWER = 2000;

    public Locomotive(double weight, double payload, double power) {
        super(weight, payload);
        this.power = power;
    }

    public Locomotive() {
        power = DEFAULT_POWER;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public static double getDefaultPower() {
        return DEFAULT_POWER;
    }

    public static void setDefaultPower(double defaultPower) {
        DEFAULT_POWER = defaultPower;
    }
}
