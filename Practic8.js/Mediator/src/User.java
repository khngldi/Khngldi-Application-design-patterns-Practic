public class User extends Colleague {
    public User(IMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {
        System.out.println(name + " отправляет сообщение: " + message);
        mediator.sendMessage(message, this);
    }

    public void sendPrivateMessage(String message, User recipient) {
        System.out.println(name + " отправляет приватное сообщение: " + message);
        mediator.sendPrivateMessage(message, this, recipient);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " получил сообщение: " + message);
    }
}
