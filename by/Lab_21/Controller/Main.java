package by.Lab_21.Controller;

import by.Lab_21.entity.Helicopter;
import by.Lab_21.entity.PassengerPlane;
import by.Lab_21.logic.Engineer;
import by.Lab_21.view.Printer;

public class Main {

    public static void main(String[] args) {

        Helicopter [] groupHelicopters = {new Helicopter(), new Helicopter("1010"), new Helicopter()};
        Printer.print("Total seats of helicopters = "+Engineer.calculateAllSeats(groupHelicopters)+"\n");
        Printer.print("Total Capacity of helicopters = "+Engineer.calculateAllCapacity(groupHelicopters)+" kilogrammes\n");
        Printer.print("Amount of helicopters = "+Helicopter.helicopteramount+"\n");

        int a;

        PassengerPlane [] groupPlanes = {new PassengerPlane(200, "10002A"), new PassengerPlane(100,20000, "B220"), new PassengerPlane()};
        Printer.print("Total seats of planes = "+Engineer.calculateAllSeats(groupPlanes)+"\n");
        Printer.print("Total Capacity of planes = "+Engineer.calculateAllCapacity(groupPlanes)+" kilogrammes\n");
        Printer.print("Amount of passenger Planes = "+PassengerPlane.passengerPlaneAmount +"\n");

    }
}
