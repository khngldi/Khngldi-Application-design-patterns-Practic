package Задача_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Fondovaya_birzha implements ISubject {
    private Map<String, Double> stocks = new HashMap<>();
    private Map<String, Set<IObserver>> observers = new HashMap<>();

    public void setStockPrice(String stockSymbol, double price) {
        stocks.put(stockSymbol, price);
        notifyObservers(stockSymbol);
    }

    public void addStock(String stockSymbol, double initialPrice) {
        stocks.put(stockSymbol, initialPrice);
        observers.put(stockSymbol, new HashSet<>());
    }

    @Override
    public void registerObserver(IObserver observer, String stockSymbol) {
        observers.get(stockSymbol).add(observer);
    }

    @Override
    public void removeObserver(IObserver observer, String stockSymbol) {
        observers.get(stockSymbol).remove(observer);
    }

    @Override
    public void notifyObservers(String stockSymbol) {
        double newPrice = stocks.get(stockSymbol);
        for (IObserver observer : observers.get(stockSymbol)) {
            observer.update(stockSymbol, newPrice);
        }
    }
}
