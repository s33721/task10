public abstract class Container {
    public Container(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload) {
        this.mass = mass;
        this.height = height;
        this.tareWeight = tareWeight;
        this.weightOfCargo = weightOfCargo;
        this.depth = depth;
        this.maximumPayload = maximumPayload;
    }

    private double mass;
    private double height;
    private double tareWeight;
    private double weightOfCargo;
    private double depth;
    private String serialNumber;
    private double maximumPayload;

    public  String getSerialNumber(){
        return this.serialNumber;
    }

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
