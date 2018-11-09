package com.epam.railway;

import com.epam.railway.entity.Train;
import com.epam.railway.entity.wagon.CargoWagon;
import com.epam.railway.entity.wagon.PostWagon;

public class Main {
    public static void main(String[] args) {
        Train train = new Train();
        train.addLocomotive();
        for (int i=0; i<19; i++) {
            train.addCargoWagon();
        }
       train.checkTrain();
    }
}
