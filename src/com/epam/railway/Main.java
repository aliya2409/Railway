package com.epam.railway;

import com.epam.railway.entity.Locomotive;
import com.epam.railway.entity.RailTransport;
import com.epam.railway.entity.wagon.CargoWagon;
import com.epam.railway.entity.wagon.PassengerWagon;
import com.epam.railway.entity.wagon.PostWagon;

import java.util.ArrayList;
import java.util.List;

import static com.epam.railway.util.TrainComposer.composeTrain;


public class Main {
    public static void main(String[] args) {
        List<RailTransport> passengerCargoTrain = new ArrayList<>();
        Locomotive locomotive = new Locomotive(48.5,34,1000);
        passengerCargoTrain.add(locomotive);
        PassengerWagon passengerWagon = new PassengerWagon(28.3,40.2,36);
        passengerWagon.setSeats(50);
        passengerCargoTrain.add(passengerWagon);
        CargoWagon cargoWagon = new CargoWagon(31.8,54.3);
        passengerCargoTrain.add(cargoWagon);
        composeTrain(passengerCargoTrain);

        List<RailTransport> passengerPostTrain = new ArrayList<>();
        Locomotive locomotive2 = new Locomotive(48.5,34,1000);
        passengerPostTrain.add(locomotive2);
        PassengerWagon passengerWagon2 = new PassengerWagon();
        passengerWagon.setSeats(50);
        passengerPostTrain.add(passengerWagon2);
        PostWagon postWagon = new PostWagon();
        passengerPostTrain.add(postWagon);
        composeTrain(passengerPostTrain);
    }
}
