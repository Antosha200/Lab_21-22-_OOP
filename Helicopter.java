package by.Lab_21.entity;

public class Helicopter extends Plane{

    public Helicopter(String msg, String flightNumber){
        this.flightNumber = flightNumber;
        if(msg == "Ми-8") {
            numSeats = 11;
            curCapacity = 3500;
        }else{
            numSeats = 4;
            curCapacity = 2000;
        }
    }
}
