import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws OverfillException {
        ArrayList<Container> ship = new ArrayList<>();
        Container petrolContainer = new LiquidContainer(200, 180, 2200, 2000, true);
        petrolContainer.loadCargo(800);
        ship.add(petrolContainer);
        Container heliumContainer = new GasContainer(200, 180, 2200, 1550, 100);
        heliumContainer.loadCargo(1000);
        ship.add(heliumContainer);
        Container bananas = new RefrigeratedContainer(200, 180, 2200, 2150, "Bananas", 13.5);
        bananas.loadCargo(2100);
        ship.add(bananas);
        Container waterContainer = new LiquidContainer(200, 180, 2200, 2000, false);
        waterContainer.loadCargo(1750);
        ship.add(waterContainer);
        System.out.println("The ship contains containers with following serial numbers:");
        for (Container container : ship) {
            System.out.println(container.getSerialNumber());
        }
    }
}