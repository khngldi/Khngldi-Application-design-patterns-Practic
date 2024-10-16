public class Bus implements ICostCalculationStrategy{
    @Override
    public double Calculator(int passenger, int TypeClass, boolean bag) {
        double cost = 0;
        if (TypeClass == 1){
            cost =  passenger * 200;
        }
        else if (TypeClass == 2){
            cost = passenger * 100;
        }
        else
            cost = passenger * 50;
        if (bag){
            cost = cost * 2;
        }
        return cost;
    }
}
