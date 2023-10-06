package structural_design_patterns.atapter_dp.sample_charger;

public class VoltBuilder {
    private int volts;

    public VoltBuilder setVolts(int volts) {
        this.volts = volts;
        return this;
    }

    public Volt build() {
        return new Volt(volts);
    }
}
