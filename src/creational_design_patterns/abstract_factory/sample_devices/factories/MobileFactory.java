package creational_design_patterns.abstract_factory.sample_devices.factories;

import creational_design_patterns.abstract_factory.sample_devices.models.Device;
import creational_design_patterns.abstract_factory.sample_devices.DeviceEnum;
import creational_design_patterns.abstract_factory.sample_devices.models.Nokia;
import creational_design_patterns.abstract_factory.sample_devices.models.OnePlus;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	public Device getGadget(DeviceEnum deviceType) {
        return switch (deviceType) {
            case NOKIA -> new Nokia("8Gb", "Qualcom");
            case ONEPLUS -> new OnePlus("12Gb", "Intel");
            default -> null;
        };
    }

}
