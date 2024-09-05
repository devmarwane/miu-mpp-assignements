package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Apartment> apartments;
    private double maintenanceCost;

    public Building(double maintenanceCost) {
        this.apartments = new ArrayList<>();
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(Apartment aprt) {
        this.apartments.add(aprt);
    }

    public double getMaintenanceCost() {
        return this.maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return this.apartments;
    }

    public double getTotalRent() {
        double sum = 0;
        for(Apartment a : this.apartments) {
            sum += a.getRent();
        }
        return sum;
    }

    public double getProfit() {
        return getTotalRent() - this.maintenanceCost;
    }
}
