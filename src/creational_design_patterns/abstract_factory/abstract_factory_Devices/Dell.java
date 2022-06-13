package creational_design_patterns.abstract_factory.abstract_factory_Devices;

public class Dell extends Device{
	
	private String ram;
	private String processor;
	private String gpu;
	
	

	public Dell(String ram, String processor, String gpu) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
	}



	@Override
	public String toString() {
		return "Dell [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}



	@Override
	public String getDetails() {
		return "Dell config is ram size" + ram + ", processor=" + processor + " gpu: " + gpu + ".";
	}

}
