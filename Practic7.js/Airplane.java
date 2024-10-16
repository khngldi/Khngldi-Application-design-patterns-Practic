public class Airplane implements ICostCalculationStrategy{
    @Override
    public double Calculator(int passenger, int TypeClass, boolean bag) {
        double cost = 0;
        if (TypeClass == 1){
            cost =  passenger * 1000;
        }
        else if (TypeClass == 2){
            cost = passenger * 800;
        }
        else
            cost = passenger * 600;
        if (bag){
            cost = cost * 2;
        }
        return cost;
    }
}
