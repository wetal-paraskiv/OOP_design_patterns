package creational_design_patterns.builder_dp;

/**
 * builder pattern provides clear separation between the construction and representation of an object.
 * Unlike other creation-al patterns, Builder doesn't require products to have a common interface.
 * That makes it possible to produce different products using the same construction process.
 *
 * Part of the reason why Builder pattern is preferred over plain old setters is that it ensures that the object
 * is initialized in one go before anyone else can use it. Just like constructors or static factory methods,
 * it ensures that an object will be initialized with the required properties before it is used.
 *
 * In essence, you would want to use the Builder design pattern when you need to create a complex object in a step by step manner.
 * When you create a simple object using just one method, you would need to take advantage of the Factory Method design pattern.
 */
public class Main {

    public static void main(String[] args) {

        // using new keyword
        Phone newPhone = new Phone("Android", 1200, "Qualcomm", 5.5, 2000);
        System.out.println(newPhone.toString());

        // using builder class
        Phone buildPphone = new PhoneBuilder()
                .setOs("ANDROID")
                .setBattery(2400)
                .setProcessor("Qualcomm")
                .setScreenSize(6.8)
                .setRam(4000)
                .build();
        System.out.println(buildPphone.toString());
    }
}
