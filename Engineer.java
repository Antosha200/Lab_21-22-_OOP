package by.Lab_21.logic;

import by.Lab_21.entity.Helicopter;
import by.Lab_21.entity.PassengerPlane;

public class Engineer {
    public static int calculateAllSeats(Helicopter[] helicopters){
        int totalSeats = 0, totalCapacity = 0;

        for (int i =0; i<helicopters.length;i++){
            totalSeats += helicopters[i].numSeats;
        }
        return totalSeats;
    }

    public static int calculateAllCapacity(Helicopter[] helicopters){
        int totalSeats = 0, totalCapacity = 0;

        for (int i =0; i<helicopters.length;i++){
            totalCapacity += helicopters[i].curCapacity;
        }
        return totalCapacity;
    }

    public static int calculateAllSeats(PassengerPlane[] passengerPlanes){
        int totalSeats = 0, totalCapacity = 0;

        for (int i =0; i<passengerPlanes.length;i++){
            totalSeats += passengerPlanes[i].numSeats;
        }
        return totalSeats;
    }

    public static int calculateAllCapacity(PassengerPlane[] passengerPlanes){
        int totalSeats = 0, totalCapacity = 0;

        for (int i =0; i<passengerPlanes.length;i++){
            totalCapacity += passengerPlanes[i].curCapacity;
        }
        return totalCapacity;
    }
}
