package creational_design_patterns.abstract_factory_design_pattern.abstract_factory_Devices;

public class MobileFactory extends AbstractDeviceFactory{

	@Override
	Device getGadget(DeviceType deviceType) {
		switch (deviceType){

		case NOKIA: {
			return new Nokia("8Gb", "Qualcom");
		}
		case ONEPLUS: {
			return new OnePlus("12Gb", "Intel");
		}
		}
		return null;
	}

}
