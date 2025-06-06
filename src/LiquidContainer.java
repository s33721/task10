public class LiquidContainer extends Container implements IHazardNotifier {
    public LiquidContainer(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload, char containerType) {
        super(mass, height, tareWeight, weightOfCargo, depth, maximumPayload, containerType = 'L');
    }

    @Override
    public void notifyHazard() {
        System.out.println("This cargo is hazardous");
        System.out.println("Container number: " + this.serialNumber);
    }

    @Override
    public void loadCargo() {
        if (weightOfCargo > 0.5 * maximumPayload) {
            System.out.println("The attempt to perform a dangerous operation has been reported.");
            throw new OverfillException("The weight of cargo is greater than maximum payload.");
        } else {
            System.out.println("The cargo has been loaded successfully");
        }
    }
}
