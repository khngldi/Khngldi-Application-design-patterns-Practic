import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items = new ArrayList<>();
    private double totalPrice;
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;
    private INotification notificationMethod;

    public void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(IDelivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void setNotificationMethod(INotification notificationMethod) {
        this.notificationMethod = notificationMethod;
    }

    public void processOrder() {
        paymentMethod.processPayment(totalPrice);
        deliveryMethod.deliverOrder(this);
        notificationMethod.sendNotification("Ваш заказ успешно обработан.");
    }
}
