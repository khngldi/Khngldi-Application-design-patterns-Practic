public class PepperoniPizza implements IPizzaBuilder{
    private Pizza pizza = new Pizza();
    @Override
    public void SetSize() {
        pizza.Cheese = "BIG";
    }

    @Override
    public void SetSauce() {
        pizza.Sauce = "Barbeku";
    }

    @Override
    public void SetCheese() {
        pizza.Cheese = "Mnogo";
    }

    @Override
    public Pizza GetPizza() {
        return null;
    }
}
