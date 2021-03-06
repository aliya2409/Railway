package com.epam.railway.entity.wagon;

import com.epam.railway.entity.RailTransport;

public class PostWagon extends RailTransport {
    private boolean forPostTransportation = true;
    private static double DEFAULT_WEIGHT = 23.5;
    private static double DEFAULT_PAYLOAD = 57;

    public PostWagon(double weight, double payload) {
        super(weight, payload);
    }

    public PostWagon() {
        weight = DEFAULT_WEIGHT;
        payload = DEFAULT_PAYLOAD;
    }

    public boolean isForPostTransportation() {
        return forPostTransportation;
    }

    public void setForPostTransportation(boolean forPostTransportation) {
        this.forPostTransportation = forPostTransportation;
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
