import java.util.ArrayList;

public class Train implements TrainRequirements {

    // Attributes
    private Engine engine; 
    private ArrayList<Car> cars;
    private int nCars;
    private int passengerCapacity; // Passenger Capacity of ONE car

    /**
     * Constructors 
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity); // because currentFuelLevel = maxFuelLevel in the beginning

        //Initialize Car list:
        cars = new ArrayList<Car>(nCars); 
        for (int i = 0; i <= nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }

        
    }

    /**
     * Accessor for the Engine
     */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Accessor for a Car
     */
    public Car getCar(int i) {
        return cars.get(i);
    }


    /** 
     * Accessor for maximum capacity among all cars
     */
    public int getMaxCapacity() {
        int totalCapacity = nCars * passengerCapacity;
        return totalCapacity;
    }


    /**
     * Accessor for seats remaining among all cars.
     */
    public int seatsRemaining() {
        int seatsRemaining = 0;
        for (int i = 0; i < cars.size(); i++) {
            seatsRemaining += this.cars.get(i).seatsRemaining();
        }
        return seatsRemaining;
    }

    /**
     * Print all passengers across all cars.
     * Print accordingly if there are none.
     */
    public void printManifest() {
        // Create ArrayList of all passengers
        ArrayList<Passenger> allPassengers = new ArrayList<>();

        // Add passengers from each car together
        for (int i = 0; i < cars.size(); i++) {
            allPassengers.addAll(cars.get(i).passengers(); 
        }

        // When there are no passengers
        if (allPassengers.size() == 0) {
            System.out.println("The train is EMPTY!");
        }
        else {
            System.out.println("Total passengers on train: " + allPassengers);
        }

    }

}
