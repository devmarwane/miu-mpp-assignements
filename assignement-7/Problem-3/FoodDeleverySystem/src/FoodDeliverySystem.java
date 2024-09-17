import java.util.ArrayList;
import java.util.Random;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create an ArrayList of Restaurants
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Sushi Palace", 5.0, 10.0));
        restaurants.add(new Restaurant("Pizza Corner", 3.5, 5.0));
        restaurants.add(new Restaurant("Burger World", 4.0, 7.5));
        // Create an ArrayList of Customers
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe", 60));
        customers.add(new Customer("Jane Smith", 40));
        customers.add(new Customer("Bob Johnson", 80));
        // Print welcome message
        System.out.println("Welcome to the Food Delivery System!");

        Random random = new Random();

        // For each Restaurant
        restaurants.forEach(restaurant -> {
            // For each Customer
            customers.forEach(customer -> {
                double orderAmount = 50 + (150 * random.nextDouble()); // Random between $50 and $200
                double deliveryCharge = restaurant.calculateDeliveryCharge(restaurant.getLocationDistance());
                double discount = restaurant.calculateDiscount(orderAmount);
                double totalAfterDiscount = orderAmount + deliveryCharge - discount;

                // Check loyalty status
                boolean isLoyal = customer.isLoyaltyCustomer(customer.getLoyaltyPoints());
                String loyaltyStatus = isLoyal ? "Loyal Customer" : "New Customer";

                // Print processing message
                System.out.println("\nProcessing order for Customer: " + customer.getCustomerName() + " at Restaurant: " + restaurant.getRestaurantName());
                System.out.println("Customer Loyalty Status: " + loyaltyStatus);

                RestaurantInterface.printFormattedData(
                        restaurant.getRestaurantName(),
                        customer.getCustomerName(),
                        orderAmount,
                        deliveryCharge,
                        discount,
                        totalAfterDiscount
                );
            });
        });
    }
}
