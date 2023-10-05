package creational_design_patterns.abstract_factory.sample_devices.factories;

import creational_design_patterns.abstract_factory.sample_devices.models.Device;
import creational_design_patterns.abstract_factory.sample_devices.DeviceEnum;
import creational_design_patterns.abstract_factory.sample_devices.models.Dell;
import creational_design_patterns.abstract_factory.sample_devices.models.Hp;

public class LaptopFactory extends AbstractDeviceFactory {

	@Override
	public Device getGadget(DeviceEnum deviceEnum) {
        return switch (deviceEnum) {
            case HP -> new Hp("8Gb", "Intel", "Nvidia");
            case DELL -> new Dell("12Gb", "AMD", "Nvidia");
            default -> null;
        };
    }

}
