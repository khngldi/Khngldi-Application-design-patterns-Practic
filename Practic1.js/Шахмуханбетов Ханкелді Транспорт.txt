package Practic1.js;

abstract class Vehicle {
    private String marka;
    private String model;
    private String year;

    public Vehicle(String marka, String model, String year){
        this.marka = marka;
        this.model = model;
        this.year = year;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void ZapuskDvigatelia() {
        System.out.println("Zapusk Dvigatelia");
    }
    public void OstanovkaDvigatelia() {
        System.out.println("Ostanovka Dvigatelia");
    }
    public abstract void Info();
}

//Shakhmukhanbetov Khangeldi