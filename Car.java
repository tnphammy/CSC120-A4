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
    public static void main(String[] args) {
        Car myCar = new Car(10);
        System.out.println(myCar.passengers.size());
    }


}