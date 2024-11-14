import java.util.Date;

public class RoomBookingSystem {
    public void Bronirovanye(int peopleAmount, Date startTime, Date endTime) {
        System.out.println("Номер забронирован для " + peopleAmount + " человек с " + startTime + " по " + endTime);
    }

    public void Proverka(double pay) {
        System.out.println("Оплата подтверждена: " + pay);
    }

    public void otmena() {
        System.out.println("Бронирование отменено");
    }
}
