package wagons;

/**
 *
 */
public class Carriage extends Wagon {
    private int passengers;
    private int baggage;
    private int comfort;

    public Carriage() {}

    public Carriage(int passengers, int baggage, int comfort) {
        this.passengers = passengers;
        this.baggage = baggage;
        this.comfort = comfort;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setComfort(int comfort) {
        this.comfort = comfort;
    }

    public int getComfort() {
        return comfort;
    }
}
