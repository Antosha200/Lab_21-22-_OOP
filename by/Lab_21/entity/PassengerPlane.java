package by.Lab_21.entity;

public class PassengerPlane extends Plane{

    public PassengerPlane(int numSeats, int CurCapacity, String flightNumber){
        setFlightNumber(flightNumber);
        setNumSeats(numSeats);
        setCurCapacity(CurCapacity);
    }
    public PassengerPlane(int numSeats, String flightNumber){
        setFlightNumber(flightNumber);
        setNumSeats(numSeats);
        setCurCapacity(5000);
    }
    public PassengerPlane(){
        setFlightNumber("0100");
        setNumSeats(400);
        setCurCapacity(5000);
    }

    public PassengerPlane(PassengerPlane passengerPlane){
        this.flightNumber = passengerPlane.flightNumber;
        this.numSeats = passengerPlane.numSeats;
        this.curCapacity = passengerPlane.curCapacity;
    }
}
