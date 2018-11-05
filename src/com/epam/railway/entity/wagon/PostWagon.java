package com.epam.railway.entity.wagon;

import com.epam.railway.entity.RailTransport;

public class PostWagon extends RailTransport {
    private boolean forPostTransportation = true;

    public PostWagon(double weight, double payload) {
        super(weight, payload);
    }

    public PostWagon() {
    }

    public boolean isForPostTransportation() {
        return forPostTransportation;
    }

    public void setForPostTransportation(boolean forPostTransportation) {
        this.forPostTransportation = forPostTransportation;
    }
}
