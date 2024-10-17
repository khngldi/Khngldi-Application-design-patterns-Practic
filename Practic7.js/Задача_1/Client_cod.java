package Задача_1;

public class Client_cod {
    public static void main(String[] args) throws Exception {
        TravelBookingContext context = new TravelBookingContext();
        context.changeCalculation(new Airplane());
        context.changeCalculation(new Bus());
        context.changeCalculation(new Train());
        var airplaneresult = context.CalculateTravelCost(1, 1, false);
        var busresult = context.CalculateTravelCost(1, 1, false);
        var trainresult = context.CalculateTravelCost(1, 1, false);
        System.out.println(airplaneresult);
        System.out.println(busresult);
        System.out.println(trainresult);
    }
}
