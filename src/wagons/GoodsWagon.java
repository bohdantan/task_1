package wagons;

/**
 *
 */
public class GoodsWagon extends Wagon{
    private int capacity;

    public GoodsWagon() {}

    public GoodsWagon(int capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
