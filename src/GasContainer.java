public class GasContainer extends Container implements IHazardNotifier{
    public GasContainer(double mass, double height, double tareWeight, double weightOfCargo, double depth, double maximumPayload){
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

    }

    @Override
    public void notifyHazard() {

    }
}
