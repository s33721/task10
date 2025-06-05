public class LiquidContainer extends Container implements IHazardNotifier {
    public LiquidContainer(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload) {
        super(mass, height, tareWeight, weightOfCargo, depth, maximumPayload);
    }

    @Override
    String serialNumber() {
        return "";
    }

    @Override
    public void setSerialNumber() {

    }

    @Override
    public String getSerialNumber() {
        return "";
    }

}
