package com.epam.railway.entity.wagon;

import com.epam.railway.entity.RailTransport;

public class CargoWagon extends RailTransport {
    private boolean forCargoTransportation = true;

    public CargoWagon(double weight, double payload) {
        super(weight, payload);
    }

    public CargoWagon() {
    }

    public boolean isForCargoTransportation() {
        return forCargoTransportation;
    }

    public void setForCargoTransportation(boolean forCargoTransportation) {
        this.forCargoTransportation = forCargoTransportation;
    }
}

