package creational_design_patterns.abstract_factory.sample_devices.factories;

import creational_design_patterns.abstract_factory.sample_devices.DeviceEnum;
import creational_design_patterns.abstract_factory.sample_devices.models.Device;

public abstract class AbstractDeviceFactory {
	public abstract Device getGadget(DeviceEnum deviceEnum);
}
