import java.util.ArrayList;

public class RefrigeratedContainer extends Container {
    private double temperature;
    private ArrayList<Product> productList = new ArrayList<>();

    public RefrigeratedContainer(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload) {
        super(mass, height, tareWeight, weightOfCargo, depth, maximumPayload);
        this.temperature = temperature;
    }

    @Override
    public void setSerialNumber() {

    }

    @Override
    public String getSerialNumber() {
        return "";
    }

    @Override
    public void loadCargo() {

    }
}
