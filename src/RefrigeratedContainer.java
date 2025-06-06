import java.util.ArrayList;

public class RefrigeratedContainer extends Container {
    private double temperature;
    private ArrayList<Product> storedProducts = new ArrayList<Product>();

    public RefrigeratedContainer(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload, char containerType) {
        super(mass, height, tareWeight, weightOfCargo, depth, maximumPayload, containerType = 'C');
        this.temperature = temperature;
    }

    @Override
    public void loadCargo() {
    }
}