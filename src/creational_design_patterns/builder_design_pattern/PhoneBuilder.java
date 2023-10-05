package creational_design_patterns.builder_design_pattern;

public class PhoneBuilder {
    /**
     * 1. all class fields;
     * 2. setters (with the return value of Builder class -> return this)
     * 3. method getObject that returns new ObjectClass(...args of class constructor)
     */
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone build() {
        return new Phone(os, ram, processor, screenSize, battery);
    }
}
