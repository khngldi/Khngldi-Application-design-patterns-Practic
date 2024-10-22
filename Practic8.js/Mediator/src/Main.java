public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();

        User user1 = new User(chatMediator, "Алиса");
        User user2 = new User(chatMediator, "Боб");
        User user3 = new User(chatMediator, "Чарли");

        chatMediator.registerColleague(user1);
        chatMediator.registerColleague(user2);
        chatMediator.registerColleague(user3);

        user1.send("Привет всем!");
        user2.send("Привет, Алиса!");
        user3.send("Всем привет!");

        user1.sendPrivateMessage("Как дела, Боб?", user2);
        user3.sendPrivateMessage("Привет, Алиса!", user1);

        System.out.println("\nИстория сообщений:");
        for (String log : chatMediator.getMessageLog()) {
            System.out.println(log);
        }
    }
}
