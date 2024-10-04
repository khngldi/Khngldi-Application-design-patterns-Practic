package Practic1.js;

abstract class Car extends Vehicle{
        private int door;
        private String transmissia;


    public Car(String marka, String model, String year, int door, String transmissia) {
        super(marka, model, year);
        this.door=door;
        this.transmissia=transmissia;
    }
    public int getDoor(){
        return door;
    }
    public String getTransmissia(){
        return transmissia;
    }
}
//Shakhmukhanbetov Khangeldi