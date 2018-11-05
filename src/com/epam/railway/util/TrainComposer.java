package com.epam.railway.util;

import com.epam.railway.entity.Locomotive;
import com.epam.railway.entity.RailTransport;
import com.epam.railway.entity.wagon.CargoWagon;
import com.epam.railway.entity.wagon.PassengerWagon;
import com.epam.railway.entity.wagon.PostWagon;

import java.util.List;

public class TrainComposer {
    public static void composeTrain(List<RailTransport> trainCandidate) {
        if ( !trainCandidate.isEmpty() &&
                isCorrectWeight(trainCandidate) && isCorrectTypeStructure(trainCandidate)) {
            System.out.println("Train is ready for departure!");
        } else {
            System.out.println("Incorrect train structure! Train is not ready!");
        }
    }

    public static boolean isCorrectWeight(List<RailTransport> trainCandidate) {
        if (trainCandidate.get(0) instanceof Locomotive) {
            double weightBalance = ((Locomotive) trainCandidate.get(0)).getPower();
            for (int i = 0; i < trainCandidate.size(); i++) {
                weightBalance -= trainCandidate.get(i).getTotalWeight();
            }
            return weightBalance > 0;
        } else {
            System.out.println("Locomotive needed");
            return false;
        }

    }

    public static boolean hasCargoWagon(List<RailTransport> trainCandidate) {
        for (int i = 1; i < trainCandidate.size(); i++) {
            if (trainCandidate.get(i) instanceof CargoWagon) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasPassengerOrPostWagon(List<RailTransport> trainCandidate) {
        for (int i = 1; i < trainCandidate.size(); i++) {
            if (trainCandidate.get(i) instanceof PassengerWagon || trainCandidate.get(i) instanceof PostWagon) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCorrectTypeStructure(List<RailTransport> trainCandidate) {
        if (hasCargoWagon(trainCandidate) && hasPassengerOrPostWagon(trainCandidate)) {
            return false;
        } else {
            return true;
        }

    }
}
