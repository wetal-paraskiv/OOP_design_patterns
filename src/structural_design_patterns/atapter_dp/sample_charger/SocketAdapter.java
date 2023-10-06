package structural_design_patterns.atapter_dp.sample_charger;

public interface SocketAdapter {
    Volt get240Volt();
    Volt get120Volt();
    Volt get12Volt();
    Volt get3Volt();
}
