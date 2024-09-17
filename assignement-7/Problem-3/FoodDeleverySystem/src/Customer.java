public class Customer implements CustomerInterface {

    private String customerName;
    private int loyaltyPoints;

    Customer(String cName, int loyaltyPoints) {
        this.customerName = cName;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public int getLoyaltyPoints() {
        return this.loyaltyPoints;
    }
}
