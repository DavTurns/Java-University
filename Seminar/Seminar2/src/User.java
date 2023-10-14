import java.util.List;

public class User {
    private String firstName;
    private String lastName;

    private List<Order> orders;

    public User(String firstName, String lastName, List<Order> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;
    }

    public double calculateTotalPriceForOrder(int index) {
        return orders.get(index).calculateTotalPrice();
    }

    public double calculateTotalPriceForAllOrders() {
        double totalprice = 0.0;
        for (Order order : orders) {
            totalprice += order.calculateTotalPrice();
        }

        return totalprice;
    }
}
