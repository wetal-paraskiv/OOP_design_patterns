package structural_design_patterns.atapter_dp.sample_charger;

public class Socket {
    public Volt getVolt() {
        return new VoltBuilder().setVolts(240).build();
    }
}
