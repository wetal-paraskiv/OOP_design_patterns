package creational_design_patterns.abstract_factory.sample_devices.factories;

import creational_design_patterns.abstract_factory.sample_devices.FactoryEnum;

public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryEnum factoryEnum) {
        return switch (factoryEnum) {
            case LAPTOPFACTORY -> new LaptopFactory();
            case MOBILEFACTORY -> new MobileFactory();
        };
    }

}
