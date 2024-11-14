import java.util.Date;

public class Main {
    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();
        hotelFacade.BookRoom(new Date(), new Date(), 2, 101);
    }
}
