public class Main {
    public static void main(String[] args) {
        IPizza pizza = new Pizza();
        pizza = new Cheese(pizza);
    }
}