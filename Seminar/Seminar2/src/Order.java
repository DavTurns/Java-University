import java.util.Date;
import java.util.List;

public class Order {
    public Date date;
    public List<OrderLine> orderLines;

    public Order(Date date, List<OrderLine> orderLines) {
        this.date = date;
        this.orderLines = orderLines;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (OrderLine line : orderLines) {
            totalPrice += line.calculatePrice();
        }
        return totalPrice;
    }


}
