abstract class PizzaDecorator implements IPizza{
    private IPizza pizza;
    protected PizzaDecorator(IPizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double GetCost() {
        return pizza.GetCost();
    }

    @Override
    public String GetDescription() {
        return pizza.GetDescription();
    }
}
