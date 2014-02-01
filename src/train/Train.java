package train;

import locomotive.Locomotive;
import wagons.Carriage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 */
public class Train {
    private Locomotive locomotive;
    private ArrayList<Carriage> wagons = new ArrayList<Carriage>();

    public Train(Locomotive locomotive, ArrayList<Carriage> wagons) {
        this.locomotive = locomotive;
        this.wagons.addAll(wagons);
    }

    public int countPassengers() {
        int passengers = 0;
        for (Carriage c : wagons) {
            passengers += c.getPassengers();
        }
        return passengers;
    }

    public int countBaggage() {
        int baggage = 0;
        for (Carriage c : wagons) {
            baggage += c.getBaggage();
        }
        return baggage;
    }

    public void sortOnComfort() {
        Collections.sort(wagons, new Comparator<Carriage>() {
            @Override
            public int compare(Carriage o1, Carriage o2) {
                return Integer.compare(o1.getComfort(), o2.getComfort());
            }
        });
    }

    public ArrayList<Carriage> findByPassengers(int minPassengers, int maxPassengers) {
        ArrayList<Carriage> list = new ArrayList<Carriage>();
        for (Carriage c : wagons) {
            if (minPassengers <= c.getPassengers() && c.getPassengers() <= maxPassengers)
                list.add(c);
        }
        return list;
    }
}
