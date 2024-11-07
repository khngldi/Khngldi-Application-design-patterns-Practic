public class Cheese extends PizzaDecorator{
    public Cheese(IPizza pizza){
        super(pizza);
    }
    @Override
    public String GetDescription() {
        return super.GetDescription() +" cheese";
    }

    @Override
    public double GetCost() {
        return super.GetCost() + 50;
    }
}
