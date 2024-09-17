public class Restaurant implements RestaurantInterface {

    private String restaurantName;
    private double baseDeliveryCharge;
    private double locationDistance;

    Restaurant(String name, double baseDeliveryCharge, double locationDistance) {
        this.restaurantName = name;
        this.baseDeliveryCharge = baseDeliveryCharge;
        this.locationDistance = locationDistance;
    }

    @Override
    public String getRestaurantName() {
        return this.restaurantName;
    }

    public double getLocationDistance(){
        return this.locationDistance;
    }

    @Override
    public double calculateDeliveryCharge(double distance) {
        return baseDeliveryCharge + (distance * 0.05);
    }
}
