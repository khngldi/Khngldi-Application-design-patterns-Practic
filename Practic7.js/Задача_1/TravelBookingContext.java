package Задача_1;

public class TravelBookingContext {
    private ICostCalculationStrategy calculation;

    public void changeCalculation(ICostCalculationStrategy calculation) {
        this.calculation = calculation;
    }
    public double CalculateTravelCost(int passenger, int TypeClass, boolean bag) throws Exception {
        if (calculation == null){
            throw new Exception("Не определен тип рассчета");
        }
        return calculation.Calculator(passenger, TypeClass, bag);
    }
}
