package creational_design_patterns.factory;

/**
 * Factory design pattern is used to create objects, it provides loose coupling and high cohesion.
 * Factory pattern encapsulate object creation logic which makes it easy to change it later
 * when you change how object gets created, or you can even introduce new object with just change in one class.
 */
public class Main {
    public static void main(String[] args) {

        FactoryOS factoryOfOperatingSystems = new FactoryOS();

        // the wrong way: exposing toAndroid the client
        OS osAndroid1 = new Android();
        osAndroid1.getSpecification();

        // the right way using factory
        OS osAndroid2 = factoryOfOperatingSystems.getSystem(OSEnum.ANDROID);
        osAndroid2.getSpecification();
    }
}
