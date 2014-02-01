package wagons;

/**
 * This class is for all wagons
 */
public abstract class Wagon {
    private int length;
    private int weight;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
