package by.Lab_21.entity;

public class Helicopter extends Plane{

    public Helicopter(){
        setCurCapacity(2500);
        setNumSeats(5);
    }

    public Helicopter(String flightNumber){
        setFlightNumber(flightNumber);
        if(flightNumber == "1010") {
            setNumSeats(15);
            setCurCapacity(8000);
        }else{
            setNumSeats(4);
            setCurCapacity(2000);
        }
    }
}
