public interface IInternalDeliveryService {
    void DeliveryOrder(String orderID);
    String GetDeliveryStatus(String orderID);
}
