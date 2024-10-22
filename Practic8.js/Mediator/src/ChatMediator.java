import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IMediator {
    private List<Colleague> colleagues;
    private List<String> messageLog;

    public ChatMediator() {
        colleagues = new ArrayList<>();
        messageLog = new ArrayList<>();
    }

    public void registerColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        if (!colleagues.contains(sender)) {
            System.out.println("Ошибка: Участник " + sender.getName() + " не зарегистрирован в чате.");
            return;
        }
        logMessage(message);
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }

    @Override
    public void sendPrivateMessage(String message, Colleague sender, Colleague recipient) {
        if (!colleagues.contains(sender) || !colleagues.contains(recipient)) {
            System.out.println("Ошибка: Один из участников не зарегистрирован в чате.");
            return;
        }
        String privateMessage = "Приватное от " + sender.getName() + ": " + message;
        recipient.receiveMessage(privateMessage);
        logMessage(privateMessage);
    }

    public void logMessage(String message) {
        messageLog.add(message);
    }

    public List<String> getMessageLog() {
        return messageLog;
    }
}
