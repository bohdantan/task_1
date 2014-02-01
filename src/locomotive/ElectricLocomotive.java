package locomotive;

/**
 *
 */
public class ElectricLocomotive extends Locomotive {
    private int electricityUsage;

    public ElectricLocomotive() {}

    public ElectricLocomotive(int power, int electricityUsage) {
        super(power);
        this.electricityUsage = electricityUsage;
    }

    public void setElectricityUsage(int electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    public int getElectricityUsage() {
        return electricityUsage;
    }
}
