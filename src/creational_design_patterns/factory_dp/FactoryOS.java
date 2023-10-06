package creational_design_patterns.factory_dp;

import creational_design_patterns.factory_dp.models.Android;
import creational_design_patterns.factory_dp.models.IOS;
import creational_design_patterns.factory_dp.models.Windows;

public class FactoryOS {
    public OS getSystem(OSEnum system) {
        return switch (system) {
            case ANDROID -> new Android();
            case IOS -> new IOS();
            case WINDOWS -> new Windows();
        };
    }
}
