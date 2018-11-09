package com.epam.railway.entity;

import com.epam.railway.entity.wagon.CargoWagon;
import com.epam.railway.entity.wagon.PassengerWagon;
import com.epam.railway.entity.wagon.PostWagon;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private double weightBalance = 0;
    List<RailTransport> trainList = new ArrayList<>();


   public void addLocomotive() {
        if(trainList.isEmpty()) {
            Locomotive locomotive = new Locomotive();
            trainList.add(locomotive);
            weightBalance = locomotive.getPower();
            System.out.println("Locomotive added!");
        } else {
            System.out.println("Failed to add a locomotive!");
        }
    }


    public void addPassengerWagon() {
        if (weightBalance > 0 && !hasCargoWagon()) {
            PassengerWagon wagon = new PassengerWagon();
            if(weightBalance>wagon.getTotalWeight()) {
                trainList.add(wagon);
                weightBalance -= wagon.getTotalWeight();
                System.out.println("Passenger wagon added!");
            } else {
                System.out.println("Failed to add a passenger wagon! Too heavy! Wagon's total weight must be " +weightBalance + " or less." );
            }
        } else {
            System.out.println("Failed to add a passenger wagon!");
        }
    }

    public void addPostWagon() {
        if (weightBalance > 0 && !hasCargoWagon()) {
            PostWagon wagon = new PostWagon();
            if (weightBalance > wagon.getTotalWeight()) {
                trainList.add(wagon);
                weightBalance -= wagon.getTotalWeight();
                System.out.println("Post wagon added!");
            } else {
                System.out.println("Failed to add a post wagon! Too heavy! Wagon's total weight must be " +weightBalance + " or less." );
            }
        }
    }

    public void addCargoWagon() {
        if (weightBalance > 0 && !hasPassengerOrPostWagon()) {
            CargoWagon wagon = new CargoWagon();
            if (weightBalance > wagon.getTotalWeight()) {
                trainList.add(wagon);
                weightBalance -= wagon.getTotalWeight();
                System.out.println("Cargo wagon added!");
            } else {
                System.out.println("Failed to add a cargo wagon! Too heavy! Wagon's total weight must be " +weightBalance + " or less." );
            }
        }
    }

    public void checkTrain() {
        if ( !trainList.isEmpty() &&
                isCorrectWeight() && isCorrectTypeStructure()) {
            System.out.println("Train is ready for departure!");
        } else {
            System.out.println("Incorrect train structure! Train is not ready!");
        }
    }

    public boolean isCorrectWeight() {
        try {
            if (trainList.get(0) instanceof Locomotive) {
                double weightBalance = ((Locomotive) trainList.get(0)).getPower();
                for (int i = 0; i < trainList.size(); i++) {
                    weightBalance -= trainList.get(i).getTotalWeight();
                }
                return weightBalance > 0;
            } else {
                System.out.println("Locomotive needed");
                return false;
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("First element in a train must be a locomotive!");
        }
        return false;
    }

    public boolean hasCargoWagon() {
        for (int i = 1; i < trainList.size(); i++) {
            if (trainList.get(i) instanceof CargoWagon) {
                return true;
            }
        }
        return false;
    }

    public  boolean hasPassengerOrPostWagon() {
        for (int i = 1; i < trainList.size(); i++) {
            if (trainList.get(i) instanceof PassengerWagon || trainList.get(i) instanceof PostWagon) {
                return true;
            }
        }
        return false;
    }

    public boolean isCorrectTypeStructure() {
        if (hasCargoWagon() && hasPassengerOrPostWagon()) {
            return false;
        } else {
            return true;
        }

    }

    public double getWeightBalance() {
        return weightBalance;
    }

    public List<RailTransport> getTrainList() {
        return trainList;
    }

    public void setTrainList(List<RailTransport> trainList) {
        this.trainList = trainList;
    }
}
