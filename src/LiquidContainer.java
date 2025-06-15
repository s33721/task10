public class LiquidContainer extends HazardousContainer {
    public boolean isCargoHazardous;
    private final double allowedMaxPayload;

    public LiquidContainer(
            double height,
            double depth,
            double tareWeight,
            double maxPayload,
            boolean isCargoHazardous) {
        super(height, depth, tareWeight, maxPayload, 'L');
        this.isCargoHazardous = isCargoHazardous;
        double capacityLimit = this.isCargoHazardous ? 0.5 : 0.9;
        this.allowedMaxPayload = maxPayload * capacityLimit;

    }

    public boolean getIsCargoHazardous() {
        return this.isCargoHazardous;
    }

    @Override
    protected boolean canLoadCargo(double mass) {
        return getCargoWeight() + mass <= this.allowedMaxPayload;
    }
}
