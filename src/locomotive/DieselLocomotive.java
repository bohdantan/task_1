package locomotive;

/**
 *
 */
public class DieselLocomotive extends Locomotive {
    private int dieselUsage;

    public DieselLocomotive() {}

    public DieselLocomotive(int power, int dieselUsage) {
        super(power);
        this.dieselUsage = dieselUsage;
    }

    public void setDieselUsage(int dieselUsage) {
        this.dieselUsage = dieselUsage;
    }

    public int getDieselUsage() {
        return dieselUsage;
    }
}
