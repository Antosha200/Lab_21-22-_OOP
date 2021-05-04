package by.Lab_21.entity;

public class CargoPlane extends Plane {
    public static int cargoPlaneAmount;
    static {
        cargoPlaneAmount  = 0; //вызывается только один раз
    }
    {
        cargoPlaneAmount++; //вызывается при создании объекта
    }
    public CargoPlane(){
        setCurCapacity(12_000);
        setNumSeats(0);
    }
    public CargoPlane(String flightNumber){
        setCurCapacity(12_000);
        setNumSeats(0);
        setFlightNumber(flightNumber);
    }
    public CargoPlane(int numSeats, int curCapacity, String flightNumber){
        this.numSeats = numSeats;
        this.curCapacity = curCapacity;
        this.flightNumber = flightNumber;
    }
}
