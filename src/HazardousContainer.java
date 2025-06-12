public abstract class HazardousContainer extends Container implements HazardNotifier {

    public HazardousContainer(
            double height,
            double depth,
            double tareWeight,
            double maxPayload,
            char containerType) {
        super(height, depth, tareWeight, maxPayload, containerType);
    }

    @Override
    public void loadCargo(double mass) throws OverfillException{
        if (mass <= 0) throw new IllegalArgumentException("Mass cannot be less or equal to 0");
        if (!canLoadCargo(mass)){
            notifyHazard("Loading cargo will exceed max payload");
            throw new OverfillException("Failed to load cargo. Max payload is exceeded");
        }
    }

    public void notifyHazard(String message) {
        System.out.println("Hazardous situation occurred for container" + getSerialNumber() + ". " + "Message: " + message);
    }
}
