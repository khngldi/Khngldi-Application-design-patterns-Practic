package Practic1.js;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Garage> garages;
    public Fleet(){
        this.garages=new ArrayList<>();
    }
    public void add(Garage garage){
        garages.add(garage);
    }
    public void remove(Garage garage){
        garages.remove(garage);
    }
    public Car find(String marka, String model){
        for (Garage garage: garages){
            for (Car car: garage.getCars()){
                if (car.getMarka().equals(marka) && car.getModel().equals(model))
                    return car;
            }
        }
        return null;
    }
}
//Shakhmukhanbetov Khangeldi