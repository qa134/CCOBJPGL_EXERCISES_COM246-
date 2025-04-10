public class App {
    public static void main(String[] args) throws Exception {
        HybridVehicle car1 = new HybridSedan();
        car1.carName = "BMW";

        HybridVehicle car2 = new HybridPickup();
        car2.carName = "Ford";

        car1.chargeBattery();
        car1.fillGas();

        car2.chargeBattery();
        car2.fillGas();
        
        Carwash cw = new Carwash();
        cw.wash(car1);
        cw.wash(car2);
    }
}