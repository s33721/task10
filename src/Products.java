public class Products {
    private String productName;
    private double requiredTemperature;

    public Products(String productName, double requiredTemperature) {
        this.productName = productName;
        this.requiredTemperature = requiredTemperature;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setRequiredTemperature(double requiredTemperature) {
        this.requiredTemperature = requiredTemperature;
    }

    public String getProductName() {
        return productName;
    }

    public double getRequiredTemperature() {
        return requiredTemperature;
    }

}
