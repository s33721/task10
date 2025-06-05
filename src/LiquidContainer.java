public class LiquidContainer extends Container implements IHazardNotifier {
    public LiquidContainer(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload) {
        super(mass, height, tareWeight, weightOfCargo, depth, maximumPayload);
    }


    @Override
    public void setSerialNumber() {

    }

    @Override
    public String getSerialNumber() {
        return "";
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
