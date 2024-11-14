import java.util.Date;

public class HotelFacade {
    public void BookRoom(Date startTime, Date endTime, int peopleAmount, int roomNumber) {
        RoomBookingSystem roomBookingSystem = new RoomBookingSystem();
        roomBookingSystem.Bronirovanye(peopleAmount, startTime, endTime);
        roomBookingSystem.Proverka(500);

        CleaningService cleaningService = new CleaningService();
        cleaningService.Notify(startTime, endTime, peopleAmount);

        RestaurantSystem restaurantSystem = new RestaurantSystem();
        restaurantSystem.Notify(roomNumber, startTime, endTime);
    }
}
