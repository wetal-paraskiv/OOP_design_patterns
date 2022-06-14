package creational_design_patterns.abstract_factory_design_pattern.abstract_factory_Devices;

public class LaptopFactory extends AbstractDeviceFactory{

	@Override
	Device getGadget(DeviceType deviceType) {
		switch (deviceType){
		
		case HP: {
			return new Hp("8Gb", "Intel", "Nvidia");
		}
		case DELL: {
			return new Dell("12Gb", "AMD", "Nvidia");
		}
		}
		return null;
	}

}
