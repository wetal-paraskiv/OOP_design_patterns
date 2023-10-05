package creational_design_patterns.abstract_factory.sample_devices.models;

public class Dell extends Device {
    private final String ram;
    private final String processor;
    private final String gpu;

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
