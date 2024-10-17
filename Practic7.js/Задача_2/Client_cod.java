package Задача_2;

public class Client_cod {
    public static void main(String[] args) {
        Fondovaya_birzha stockExchange = new Fondovaya_birzha();
        stockExchange.addStock("AAPL", 150.0);
        stockExchange.addStock("GOOG", 2800.0);
        Trader trader1 = new Trader("Trader1");
        Trader trader2 = new Trader("Trader2");
        TraderRobot robot = new TraderRobot(2000.0);
        stockExchange.registerObserver(trader1, "AAPL");
        stockExchange.registerObserver(trader2, "GOOG");
        stockExchange.registerObserver(robot, "GOOG");
        stockExchange.setStockPrice("AAPL", 155.0);
        stockExchange.setStockPrice("GOOG", 2900.0);
        stockExchange.setStockPrice("GOOG", 1950.0);
    }
}
