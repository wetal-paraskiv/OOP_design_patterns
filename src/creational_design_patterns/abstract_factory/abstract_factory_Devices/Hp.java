package creational_design_patterns.abstract_factory.abstract_factory_Devices;

public class Hp extends Device{
	
	private String ram;
	private String processor;
	private String gpu;
	
	

	public Hp(String ram, String processor, String gpu) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
	}




	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}




	@Override
	public String getDetails() {
		return "HP config is ram size" + ram + ", processor=" + processor + " gpu: " + gpu + ".";
	}

}
