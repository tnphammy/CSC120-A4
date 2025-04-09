public class Engine implements EngineRequirements {

    // Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Constructor for Engine
     * @param f Engine's fuel type
     * @param currentFuelLevel Engine's current fuel level
     * @param maxFuelLevel Engine's maximum fuel level
     */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel) {
        this.f = f;
        this.currentFuelLevel = maxFuelLevel; // Fuel is FULL at the beginning
        this.maxFuelLevel = maxFuelLevel;
    }

    /**
     * Accessor for fuel type 
     */
    public FuelType getFuelType() {
        return this.f; 
    }

    /**
     * Accessor for the maximum fuel level of the engine
     */
    public double getMaxFuel() {
        return this.maxFuelLevel;
    }

    /**
     * Accessor for the current fuel level of the engine
     */
    public double getCurrentFuel() {
        return this.currentFuelLevel;
    }

    /**
     * Reset the Engine's current fuel level to its maximum.
     * @param currentFuelLevel Engine's current fuel level.
     */
    public void refuel() {
        this.currentFuelLevel = this.maxFuelLevel;

    }

    /**
     * Decrease the current fuel level
     * Print information (i.e. remaining fuel level, and warning if fuel levels are low)
     * Return `true` if the fuel level > 0 and `false` otherwise.
     * 
     * @return T/F
     */
    public Boolean go() { 
        if(this.currentFuelLevel - 10 <= 0) {
            System.out.println("Warning: Engine does not have enough fuel to keep going.");
            return false;
        } 
        else {
            this.currentFuelLevel -= 10;
            System.out.println("Fuel remaining: " + this.currentFuelLevel);
            return true;
        }
    }

    public String toString() {
        return ("Engine has fuel type: " + this.f + " current fuel level: " + this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel);
    }

    public static void main(String[] args) {
        // Engine myEngine = new Engine(FuelType.ELECTRIC, 0., 100.);
        // System.out.println(myEngine);

        // Engine myOtherEngine = new Engine(FuelType.STEAM, 50., 100.);
        // System.out.println(myOtherEngine);

        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0);
        System.out.println(myEngine.getCurrentFuel());
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");   
        myEngine.refuel();     
    }
}