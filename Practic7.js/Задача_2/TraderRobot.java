package Задача_2;

public class TraderRobot implements IObserver {
    private double threshold;

    public TraderRobot(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String stockSymbol, double price) {
        if (price > threshold) {
            System.out.println("Робот продает акции " + stockSymbol + " по цене " + price);
        } else {
            System.out.println("Робот покупает акции " + stockSymbol + " по цене " + price);
        }
    }
}
