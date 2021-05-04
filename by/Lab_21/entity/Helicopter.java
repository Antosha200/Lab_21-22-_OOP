package by.Lab_21.entity;

public class Helicopter extends Plane{

    public static int helicopteramount;

    static {
        helicopteramount  = 0; //вызывается только один раз
    }
    {
        helicopteramount++; //вызывается при создании объекта
    }
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

    public Helicopter(Helicopter helicopter){
        this.numSeats = helicopter.numSeats;
        this.curCapacity = helicopter.curCapacity;
        this.flightNumber = helicopter.flightNumber;
    }
}
