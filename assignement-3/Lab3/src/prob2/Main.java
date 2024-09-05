package prob2;

public class Main {
    public static void main(String[] args) {

        Apartment app1 = new Apartment(90000);
        Apartment app2 = new Apartment(80000);

        Apartment app3 = new Apartment(89077);
        Apartment app4 = new Apartment(56789);

        Building building1 = new Building(9000);
        building1.addApartment(app1);
        building1.addApartment(app2);

        Building building2 = new Building(22000);
        building2.addApartment(app3);
        building2.addApartment(app4);


        Landlord landlord = new Landlord();
        landlord.addBuilding(building1);
        landlord.addBuilding(building2);


        double totalProfit = landlord.getTotalProfit();

        System.out.println("The total profit is : "+totalProfit);
    }
}