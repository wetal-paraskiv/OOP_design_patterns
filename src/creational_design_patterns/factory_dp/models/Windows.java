package creational_design_patterns.factory_dp.models;

import creational_design_patterns.factory_dp.OS;
import creational_design_patterns.factory_dp.OS_usage;

public class Windows implements OS, OS_usage {
    private final String usageDevice = setUsageDevice();

    @Override
    public void getSpecification() {
        System.out.println(this.getClass().getSimpleName() +
                " - most Windowed operating system for " +
                this.usageDevice);
    }

    @Override
    public String setUsageDevice() {
        return "PC";
    }
}
