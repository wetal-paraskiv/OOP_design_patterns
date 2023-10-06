package creational_design_patterns.factory_dp;

import creational_design_patterns.factory_dp.models.Android;

/**
 * Factory design pattern is used to create objects, it provides loose coupling and high cohesion.
 * Factory pattern encapsulate object creation logic which makes it easy to change it later
 * when you change how object gets created, or you can even introduce new object with just change in one class.
 */
public class Main {
    public static void main(String[] args) {

        FactoryOS factoryOS = new FactoryOS();

        // the wrong way: exposing toAndroid the client
        OS newAndroid = new Android();

        // the right way using factory
        OS factoryAndroid = factoryOS.getSystem(OSEnum.ANDROID);
        factoryAndroid.getSpecification();

        OS factoryIOS = factoryOS.getSystem(OSEnum.IOS);
        factoryIOS.getSpecification();

        OS factoryWindows = factoryOS.getSystem(OSEnum.WINDOWS);
        factoryWindows.getSpecification();
    }
}
