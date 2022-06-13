package creational_design_patterns.abstract_factory.abstract_factory_Devices;

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
