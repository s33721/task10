public class Product {
    private String productName;
    private double requiredTemperature;

    public Product(String productName, double requiredTemperature) {
        this.productName = productName;
        this.requiredTemperature = requiredTemperature;
    }

    public String getProductName() {
        return productName;
    }

    private double getRequiredTemperature() {
        return requiredTemperature;
    }

}
