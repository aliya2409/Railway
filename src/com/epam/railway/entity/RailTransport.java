package com.epam.railway.entity;

public abstract class RailTransport {
    private static long idCounter;
    private long id;
    protected double weight;
    protected double payload;

    public RailTransport(double weight, double payload) {
        this.weight = weight;
        this.payload = payload;
        idCounter ++;
        id = idCounter;
    }

    public RailTransport() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public double getTotalWeight() {
        return weight + payload;
    }

    public long getId() {
        return id;
    }
}
