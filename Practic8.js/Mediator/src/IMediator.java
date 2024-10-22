import java.util.List;

public interface IMediator {
    void sendMessage(String message, Colleague colleague);
    void sendPrivateMessage(String message, Colleague sender, Colleague recipient);
    void registerColleague(Colleague colleague);
}
