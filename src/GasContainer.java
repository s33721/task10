public class GasContainer extends HazardousContainer {
    private double pressure;

    public GasContainer(
            double height,
            double depth,
            double tareWeight,
            double maxPayload,
            double pressure) {
        super(height, depth, tareWeight, maxPayload, 'G');
        setPressure(pressure);
    }

    public double getPressure() {
        return this.pressure;
    }

    public void setPressure(double pressure) {
        if (pressure < 0) throw new IllegalArgumentException("Pressure should be positive");
        this.pressure = pressure;
    }

    @Override
    public void emptyCargo() {
        setCargoWeight(getCargoWeight() * 0.05);
    }
}
