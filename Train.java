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
        for (int i = 0; i < nCars; i++) {
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
     */
    public void printManifest() {
        if (!cars.isEmpty()) { // If the cars are not empty.
            System.out.println("Passengers on board: ");

            // Loops through every car.
            for(int i = 0; i < cars.size(); i++) {
                System.out.println("\n Car number " + (i+1) + ": ");
                getCar(i).printManifest();
            }
        }
        else {
            System.out.println("There are no cars, thus no passengers on board.");
        }
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100, 5, 10);
        Car myCar = myTrain.getCar(0);
        Passenger tammy = new Passenger("Tammy");
        tammy.boardCar(myCar);

        myTrain.printManifest();
        
        
    }

}


