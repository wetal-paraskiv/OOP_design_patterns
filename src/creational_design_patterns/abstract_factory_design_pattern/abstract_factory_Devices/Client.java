package creational_design_patterns.abstract_factory_design_pattern.abstract_factory_Devices;
/**
 * creational design pattern
 * allows you to produce families of related objects without specifying their concrete classes
 * @author vparasch
 *
 */

public class Client {

	public static void main (String[] args) {
		Device laptop = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
		System.out.println(laptop);
		
		Device mobile = FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY).getGadget(DeviceType.NOKIA);
		System.out.println(mobile);
	}
}
