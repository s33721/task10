import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws OverfillException {
        ArrayList<Container> ship = new ArrayList<>();
        Container petrolContainer = new LiquidContainer(200, 180, 2200, 2000, true);
        petrolContainer.loadCargo(222222222);
        ship.add(petrolContainer);

    }
}