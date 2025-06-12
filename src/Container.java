public abstract class Container {
    private final String serialNumber;
    private double height;
    private double depth;
    private double maxPayload;
    private double cargoWeight;
    private double tareWeight;

    private static int nextContainer = 1;

    public Container(
            double height,
            double depth,
            double tareWeight,
            double maxPayload,
            char containerType)
    {
        setHeight(height);
        setDepth(depth);
        setTareWeight(tareWeight);
        setMaxPayload(maxPayload);
        String containerPrefix = "KON";
        this.serialNumber = containerPrefix +  "-" +  containerType + "-" + nextContainer++;
    }

    public void loadCargo(double mass) throws OverfillException{
        if (mass <= 0) throw new IllegalArgumentException("Mass cannot be less or equal to 0");
        if (!canLoadCargo(mass)) throw new OverfillException("Failed to load cargo. Maximum payload exceeded");

        setCargoWeight(getCargoWeight() + mass);
    }

    public void emptyCargo() {
        setCargoWeight(0);
    }

    protected boolean canLoadCargo(double mass){
        return getCargoWeight() + mass <= getMaxPayload();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public double getMaxPayload() {
        return maxPayload;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public double getTareWeight() {
        return tareWeight;
    }

    protected void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    private void setTareWeight(double tareWeight) {
        if (tareWeight > 0) this.tareWeight = tareWeight;
        else throw new IllegalArgumentException("Height should be bigger than 0");
    }

    private void setDepth(double depth) {
        if (depth > 0) this.depth = depth;
        else throw new IllegalArgumentException("Height should be bigger than 0");
    }

    private void setHeight(double height) {
        if (height > 0) this.height = height;
        else throw new IllegalArgumentException("Height should be bigger than 0");
    }

    private void setMaxPayload(double maxPayload) {
        if (maxPayload > 0) this.maxPayload = maxPayload;
        else throw new IllegalArgumentException("Height should be bigger than 0");
    }

}
