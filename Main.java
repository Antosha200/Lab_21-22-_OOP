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

        PassengerPlane [] group = {first,second,third};
        Printer.print(String.valueOf(Engineer.calculateAllSeats(group)));

    }
}
