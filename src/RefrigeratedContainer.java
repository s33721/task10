public class RefrigeratedContainer extends Container {
    private final double maintainedTemperature;
    private final String productType;

    public RefrigeratedContainer(
            double height,
            double depth,
            double tareWeight,
            double maxPayload,
            String productType,
            double maintainedTemperature) {
        super(height, depth, tareWeight, maxPayload, 'C');

        if (ProductTemperatureHelper.isValid(productType, maintainedTemperature)) {
            this.maintainedTemperature = maintainedTemperature;
            this.productType = productType;
        } else {
            throw new IllegalArgumentException("Maintained temperature is too low for provided product type");
        }
    }

    public double getMaintainedTemperature() {
        return this.maintainedTemperature;
    }

    public String getProductType() {
        return this.productType;
    }
}
