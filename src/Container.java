public abstract class Container {
    public Container(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload, char containerType) {
        this.mass = mass;
        this.height = height;
        this.tareWeight = tareWeight;
        this.weightOfCargo = weightOfCargo;
        this.depth = depth;
        this.maximumPayload = maximumPayload;
        this.serialNumber = ("KON" + "-" + containerType + totalContainers++).toUpperCase();
    }

    protected double mass;
    protected double height;
    protected double tareWeight;
    protected double weightOfCargo;
    protected double depth;
    protected final String serialNumber;
    protected double maximumPayload;

    private static int totalContainers = 0;

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
