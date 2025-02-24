public class Passenger {
    
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
            System.out.println(this.name + " could NOT board the car!");
        }
    }

}
