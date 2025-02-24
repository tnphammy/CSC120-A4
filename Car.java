import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car implements CarRequirements {

    // Attributes
    public int capacity;
    public ArrayList<Passenger> passengers;
    

     /**
     * Constructor for Car
     * @param capacity Car's passenger limit
     */
    public Car (int capacity) {
        this.capacity = capacity;
        this.passengers = new ArrayList<>(capacity);
        
    }

    /**
     * Get Car's maximum capacity
     */
    public int getCapacity() {
        return this.capacity;

    }

    /**
     * Return the number of remaining seats
     */
    public int seatsRemaining() {
        int seatsRemaining = this.capacity - this.passengers.size();
        return (seatsRemaining);

    }

    /**
     * Add a passenger to the Car if a seat is available.
     * Returns 'true' or 'false' if the operation was successful or not.
     * @param p The new passenger
     * @return 'true' or 'false'
     */
    public Boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            passengers.add(p);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Remove a passenger from the car if there is one.
     * Returns 'true' or 'false' if the operation was successful or not.
     * @param p The passenger to be removed
     * @return 'true' or 'false'
     */
    public Boolean removePassenger (Passenger p) {
        if (seatsRemaining() == capacity) { // When no one is in the car.
            return false;
        }
        else {
            passengers.remove(p);
            return true;
        }
    }

    /**
     * Print a list of all passengers on board.
     * Print "This car is EMPTY." if there is no one on board
     * @param args
     */
    public void printManifest() {
        if (seatsRemaining() == capacity) { // When no one is in the car.
            System.out.println("This car is EMPTY.");
        }
        else {
            System.out.println(passengers);
        }
    }
    public static void main(String[] args) {
        Car myCar = new Car(10);
        System.out.println(myCar.passengers.size());
        Passenger Tammy = new Passenger("Tammy");
        myCar.addPassenger(Tammy);
        System.out.println(myCar.passengers.size());
        System.out.println(myCar.seatsRemaining());
        myCar.removePassenger(Tammy);
        System.out.println(myCar.seatsRemaining());

    }


}