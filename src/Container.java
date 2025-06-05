public abstract class Container {
    public Container(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload) {
        this.mass = mass;
        this.height = height;
        this.tareWeight = tareWeight;
        this.weightOfCargo = weightOfCargo;
        this.depth = depth;
        this.maximumPayload = maximumPayload;
    }

    double mass;
    double height;
    double tareWeight;
    double weightOfCargo;
    double depth;
    String serialNumber;

    double maximumPayload;

    public abstract void setSerialNumber();

    public abstract String getSerialNumber();

    public void emptyCargo() {
        if (weightOfCargo == 0) {
            System.out.println("Cargo is already empty");
        } else {
            this.weightOfCargo = 0;
            System.out.println("Cargo has been emptied");
        }
    }

    public abstract void loadCargo();
}
