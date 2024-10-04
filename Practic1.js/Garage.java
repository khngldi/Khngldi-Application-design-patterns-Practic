package Practic1.js;
import java.util.ArrayList;
import java.util.List;
public class Garage {
    private List<Car> cars;
    public Garage(){
        this.cars=new ArrayList<>();
    }

    public void add(Car Car){
        cars.add(Car);
    }
    public void remove(Car Car){
        cars.remove(Car);
    }
    public void List(){
        for (Car car : cars){
            car.Info();
        }
    }
    public List<Car> getCars(){
        return cars;
    }
}
//Shakhmukhanbetov Khangeldi