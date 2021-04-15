package by.Lab_21.entity;

public class PassengerPlane extends Plane{

    public PassengerPlane(int numSeats, int CurCapacity, String flightNumber){
        this.flightNumber = flightNumber;
        this.numSeats = numSeats;
        this.curCapacity = CurCapacity;
    }
    public PassengerPlane(int numSeats, String flightNumber){
        this.flightNumber = flightNumber;
        this.numSeats = numSeats;
        this.curCapacity = 5000;
    }

    public PassengerPlane(){
        this.flightNumber = "0100";
        this.numSeats = 400;
        this.curCapacity = 2500;
    }

}
