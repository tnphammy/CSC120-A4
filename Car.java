import java.util.ArrayList;

public class Car implements CarRequirements {

    // Attributes
    private int capacity;
    private ArrayList<Passenger> passengers;

    
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
        if (passengers.contains(p)) {
            return false;
        } else {
            if (seatsRemaining() > 0) {
                passengers.add(p);
                return true;
            }
            else {
                return false;
            }  
        }
    }

    /**
     * Remove a passenger from the car if there is one.
     * Returns 'true' or 'false' if the operation was successful or not.
     * @param p The passenger to be removed
     * @return 'true' or 'false'
     */
    public Boolean removePassenger (Passenger p) {
        if (seatsRemaining() == capacity) { // No one is in the car.
            return false;
        }
        else {
            if (passengers.contains(p)) { // Passenger is IN car -> they CAN be removed
                passengers.remove(p);
                return true;
            }
            else {
                return false;
            }
        }
    }

    /**
     * Print a list of all passengers on board.
     * Print "This car is EMPTY." if there is no one on board
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

        Car myCar = new Car(2);
        Passenger tammy = new Passenger("Tammy");

        tammy.boardCar(myCar);
        myCar.printManifest(); 


    
        

    }


}