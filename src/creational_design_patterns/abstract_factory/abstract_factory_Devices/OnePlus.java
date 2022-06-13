package creational_design_patterns.abstract_factory.abstract_factory_Devices;

public class OnePlus extends Device {

	private String ram;
	private String processor;


	
	public OnePlus(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}



	@Override
	public String toString() {
		return "OnePlus [ram=" + ram + ", processor=" + processor + "]";
	}



	@Override
	public String getDetails() {
		return "OnePlus config is ram size" + ram + ", processor=" + processor + ".";
	}
}
