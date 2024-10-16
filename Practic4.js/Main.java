public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("Донер", 1400);
        order.addItem("Смарт-часы Самсунг", 150000);
        order.setPaymentMethod(new CreditCardPayment());
        order.setDeliveryMethod(new CourierDelivery());
        order.setNotificationMethod(new EmailNotification());
        order.processOrder();
    }
}
