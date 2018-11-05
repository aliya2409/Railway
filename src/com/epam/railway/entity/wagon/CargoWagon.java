package com.epam.railway.entity.wagon;

import com.epam.railway.entity.RailTransport;

public class CargoWagon extends RailTransport {
    private boolean forCargoTransportation = true;
    private static double DEFAULT_WEIGHT = 25.5;
    private static double DEFAULT_PAYLOAD = 81;

    public CargoWagon(double weight, double payload) {
        super(weight, payload);
    }

    public CargoWagon() {
        weight = DEFAULT_WEIGHT;
        payload = DEFAULT_PAYLOAD;
    }

    public boolean isForCargoTransportation() {
        return forCargoTransportation;
    }

    public void setForCargoTransportation(boolean forCargoTransportation) {
        this.forCargoTransportation = forCargoTransportation;
    }

    public static double getDefaultWeight() {
        return DEFAULT_WEIGHT;
    }

    public static double getDefaultPayload() {
        return DEFAULT_PAYLOAD;
    }

    public static void setDefaultWeight(double defaultWeight) {
        DEFAULT_WEIGHT = defaultWeight;
    }

    public static void setDefaultPayload(double defaultPayload) {
        DEFAULT_PAYLOAD = defaultPayload;
    }
}

