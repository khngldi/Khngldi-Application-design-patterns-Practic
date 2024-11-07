public class LogisticGlovoService implements IInternalDeliveryService{
    private ExternalGlovoService glovoService;

    public LogisticGlovoService(ExternalGlovoService glovoService){
        this.glovoService = glovoService;
    }

    @Override
    public String GetDeliveryStatus(String orderID) {
        int item = Integer.parseInt(orderID);
        return glovoService.TrackShipment(item);
    }

    @Override
    public void DeliveryOrder(String orderID) {
        int item = Integer.parseInt(orderID);
        glovoService.ShipItem(item);
    }
}
