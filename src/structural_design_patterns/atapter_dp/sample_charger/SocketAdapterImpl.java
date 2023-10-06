package structural_design_patterns.atapter_dp.sample_charger;

public class SocketAdapterImpl extends Socket implements SocketAdapter {
    // Using inheritance for adapter pattern
    @Override
    public Volt get240Volt() {
        return getVolt();
    }

    @Override
    public Volt get120Volt() {
        return new VoltBuilder().setVolts(120).build();
    }

    @Override
    public Volt get12Volt() {
        return new VoltBuilder().setVolts(12).build();
    }

    @Override
    public Volt get3Volt() {
        return new VoltBuilder().setVolts(3).build();
    }
}
