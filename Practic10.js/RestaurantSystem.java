import java.util.Date;

public class RestaurantSystem {
    public void Notify(int roomNumber, Date startTime, Date endTime) {
        System.out.println("Ресторан уведомлен для номера " + roomNumber + " с " + startTime + " по " + endTime);
    }
}
