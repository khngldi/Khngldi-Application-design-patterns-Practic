package Practic1.js;

abstract class MotorCycle extends Vehicle{
    private String kuzov;
    private String box;
    public MotorCycle(String marka, String model, String year, String kuzov, String box) {
        super(marka, model, year);
        this.box=box;
        this.kuzov=kuzov;
    }

    public String getBox() {
        return box;
    }

    public String getKuzov() {
        return kuzov;
    }
}
//Shakhmukhanbetov Khangeldi