package by.Lab_21.Controller;

import by.Lab_21.Input.UserInput;
import by.Lab_21.entity.PassengerPlane;
import by.Lab_21.logic.Engineer;
import by.Lab_21.view.Printer;

public class Main {

    public static void main(String[] args) {

        PassengerPlane first = new PassengerPlane();
        PassengerPlane second = new PassengerPlane();
        PassengerPlane third = new PassengerPlane();
        PassengerPlane fourth = new PassengerPlane(200,3000, "D234");

        PassengerPlane [] group = {first,second,third,fourth};
        Printer.print("Total seats of planes = "+Engineer.calculateAllSeats(group)+"\n");
        Printer.print("Total Capacity of planes = "+Engineer.calculateAllCapacity(group)+" kilogrammes\n");

    }
}
