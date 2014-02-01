package locomotive;

/**
 * This class is for all locomotives
 */
public abstract class Locomotive {
    private int power;

    public Locomotive() {}

    public Locomotive(int power) {
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
