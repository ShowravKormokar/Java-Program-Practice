public class Car{

    private String brand;
    private String model;
    private int launchYear;

    public Car(){
        brand = "Unknown";
        model = "Unknown";
        launchYear = 0;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setLaunchYear(int launchYear){
        this.launchYear = launchYear;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getLaunchYear(){
        return launchYear;
    }

    public String toString(){
        return "Car [brand= "+brand+", model= "+model+", launchYear= "+launchYear+"]";
    }
}