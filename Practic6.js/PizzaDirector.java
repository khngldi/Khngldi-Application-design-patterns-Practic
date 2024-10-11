public class PizzaDirector {
    private IPizzaBuilder _pizzabuilder;
    public PizzaDirector(IPizzaBuilder pizzaBuilder){
        _pizzabuilder = pizzaBuilder;
    }
    public void ConstructPizza(){
        _pizzabuilder.SetSize();
        _pizzabuilder.SetCheese();
        _pizzabuilder.SetSauce();
    }
    public Pizza GetPizza(){
        return _pizzabuilder.GetPizza();
    }
}
