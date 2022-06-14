package creational_design_patterns.abstract_factory_design_pattern.abstract_factory_Devices;

public class FactoryGenerator {
	public static AbstractDeviceFactory getFactory(FactoryType factoryType) {
		switch (factoryType){
		case LAPTOPFACTORY: {
			return new LaptopFactory();
		}
		case MOBILEFACTORY: {
			return new MobileFactory();
		}
		}
		return null;
	}

}
