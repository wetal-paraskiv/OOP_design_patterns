package creational_design_patterns.abstract_factory.sample_devices;

import creational_design_patterns.abstract_factory.sample_devices.models.Device;
import creational_design_patterns.abstract_factory.sample_devices.factories.FactoryGenerator;

/**
 * creational design pattern
 * allows you to produce families of related objects without specifying their concrete classes
 * @author vparasch
 *
 */

public class Main {

	public static void main (String[] args) {
		Device laptopDell = FactoryGenerator.getFactory(FactoryEnum.LAPTOPFACTORY).getGadget(DeviceEnum.DELL);
		System.out.println(laptopDell);
		
		Device mobileNokia = FactoryGenerator.getFactory(FactoryEnum.MOBILEFACTORY).getGadget(DeviceEnum.NOKIA);
		System.out.println(mobileNokia);
	}
}
