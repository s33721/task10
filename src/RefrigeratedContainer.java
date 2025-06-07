import java.util.ArrayList;

public class RefrigeratedContainer extends Container {
    private double temperature;
    private ArrayList<Product> storedProducts = new ArrayList<Product>();

    public RefrigeratedContainer(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload, char containerType) {
        super(mass, height, tareWeight, weightOfCargo, depth, maximumPayload, containerType = 'C');
        this.temperature = temperature;
    }

    @Override
    public void loadCargo(Product p) {
        if (weightOfCargo > 0.9 * maximumPayload) {
            if (!storedProducts.isEmpty()) {
                if (storedProducts.contains(p)) {
                    storedProducts.add(p);
                    System.out.println("Product loaded successfully.");
                } else {
                    System.out.println("Container can only store one type of product.");
                }
            } else if (storedProducts.isEmpty() && temperature == p.getRequiredTemperature()) {
                storedProducts.add(p);
                System.out.println("Product loaded successfully.");
            } else {
                System.out.println("Temperature required by the product must be the same as temperature maintained by the container.");
            }
        } else {
            throw new OverfillException("Weight of the cargo is greater than the maximum payload");
        }
    }
}
