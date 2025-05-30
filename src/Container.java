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
    abstract String serialNumber();
    double maximumPayload;
    public void emptyCargo(){
        if (weightOfCargo == 0){
            System.out.println("Cargo is already empty");
        } else{
            this.weightOfCargo = 0;
            System.out.println("Cargo has been emptied");
        }
    }
    public void loadCargo(){
        if (weightOfCargo > maximumPayload){
            throw new OverfillException("The weight of the cargo is greater than the maximum payload");
        } else{
            this.mass = this.tareWeight + this.weightOfCargo;
        }
    }
}
