import java.util.Date;

public class CleaningService {
    public void Notify(Date startTime, Date endDate, int peopleAmount) {
        System.out.println("Услуга уборки уведомлена для " + peopleAmount + " человек с " + startTime + " по " + endDate);
    }
}
