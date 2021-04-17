package by.Lab_21.entity;

public class Plane {
    public int numSeats;
    public int curCapacity;
    public String flightNumber;

    public static final int MIN_CAPACITY = 1;
    public static final int MAX_CAPACITY = 100_000;
    public static final int MIN_SEATS = 0;
    public static final int MAX_SEATS = 1000;

    public int getCurCapacity() {
        return curCapacity;
    }

    public void setCurCapacity(int curCapacity) {
        if(curCapacity>MIN_CAPACITY && curCapacity < MAX_CAPACITY) {
            this.curCapacity = curCapacity;
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        if (numSeats>=MIN_SEATS && numSeats<MAX_SEATS)
        this.numSeats = numSeats;
    }
}

