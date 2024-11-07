public class Main {
    public static void main(String[] args) {
        String orderType = "Nexia";
        IInternalDeliveryService service = null;

        if (orderType == "Nexia"){
            service = new InternalDeliveryService();
        }
        else if(orderType == "Mazda"){
            service = new LogisticGlovoService(new ExternalGlovoService());
        }
        service.DeliveryOrder("12345");
        String status = service.GetDeliveryStatus("12345");
    }
}