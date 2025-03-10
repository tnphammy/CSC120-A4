public class Passenger implements PassengerRequirements{
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    /**
     * Boards a passenger to a car.
     * @param c The car that the passenger wants to board
     */
    public void boardCar(Car c) {
        if (c.addPassenger(this) == true) {
            System.out.println(this.name + " has successfully boarded the car!");
        }
        else {
            System.out.println(this.name + " could NOT board the car.");
        }
    }

    /**
     * Removes a passenger from a car.
     * @param c The car that the passenger wants to get off of
     */
    public void getOffCar(Car c) {
        if (c.removePassenger(this) == true) {
            System.out.println(this.name + " has successfully gotten off the car!");
        }
        else {
            System.out.println(this.name + " could NOT get off the car.");
        }
    }

}
