package structural_design_patterns.atapter_dp.sample_charger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdapterPatternTest {

    @Test
    public void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketAdapterImpl();
        assertEquals(3, getVolt(sockAdapter, 3).getVolts());
        assertEquals(12, getVolt(sockAdapter, 12).getVolts());
        assertEquals(120, getVolt(sockAdapter, 120).getVolts());
        assertEquals(240, getVolt(sockAdapter, 240).getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        return switch (i) {
            case 3 -> sockAdapter.get3Volt();
            case 12 -> sockAdapter.get12Volt();
            case 120 -> sockAdapter.get120Volt();
            default -> sockAdapter.get240Volt();
        };
    }
}
