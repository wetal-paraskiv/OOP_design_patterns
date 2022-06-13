package creational_design_patterns.abstract_factory.abstract_factory_Devices;

public class Nokia extends Device{
	
	private String ram;
	private String processor;
	
	

	public Nokia(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}



	@Override
	public String toString() {
		return "Nokia [ram=" + ram + ", processor=" + processor + "]";
	}



	@Override
	public String getDetails() {
		return "Nokia config is ram size" + ram + ", processor=" + processor + ".";
	}

}

