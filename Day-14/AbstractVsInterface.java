abstract class Appliance {
    String brand;
    Appliance(String brand) {
        this.brand = brand;
    }
    void showBrand(){
        System.out.println("Brand: "+brand);
    }
}
interface EnergyEfficient {
    double calculatePowerConsumption();
}
class WashingMachine extends Appliance implements EnergyEfficient {
    WashingMachine(String brand) {
        super(brand);
    }
    @Override
    public double calculatePowerConsumption(){
        return 2.5;
    }
}

public class AbstractVsInterface {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("Samsung");
        wm.showBrand();
        System.out.println("Power Consumption: "+wm.calculatePowerConsumption()+ " kWh");
    }
}
