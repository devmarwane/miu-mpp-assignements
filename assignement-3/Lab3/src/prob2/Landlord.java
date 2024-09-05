package prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private List<Building> buildings;

    public Landlord() {
        buildings = new ArrayList<>();
    }

    List<Building> getBuildings() {
        return this.buildings;
    }

    void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public double getTotalProfit() {
        double sum= 0;
        for(Building b : this.buildings) {
            sum += b.getProfit();
        }
        return sum;
    }


}
