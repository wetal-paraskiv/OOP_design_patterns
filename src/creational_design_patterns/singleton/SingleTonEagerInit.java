package creational_design_patterns.singleton;

/**
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a creational_design_patterns.singleton class, but it has a drawback that instance is created
 * even though client application might not be using it.
 */
public class SingleTonEagerInit {

    private static final SingleTonEagerInit INSTANCE = new SingleTonEagerInit();

    private SingleTonEagerInit() {
    }

    public static SingleTonEagerInit getInstance() {
        return INSTANCE;
    }
}
