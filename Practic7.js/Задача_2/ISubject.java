package Задача_2;

public interface ISubject {
    void registerObserver(IObserver observer, String stockSymbol);
    void removeObserver(IObserver observer, String stockSymbol);
    void notifyObservers(String stockSymbol);
}
