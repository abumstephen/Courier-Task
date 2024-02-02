import java.util.List;

public class Main {

    public static void main(String[] args) {
    Order o=new Order();
        List<Order> orders = o.receiveOrders();
        for (Order order : orders) {
            o.updateOrderStatus(order, "Picked up"); // Initial status
            o.deliverFood(order);
        }

}
}