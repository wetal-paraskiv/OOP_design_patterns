package creational_design_patterns.singleton_dp;

/**
 * Static block initialization implementation is similar to eager initialization, except that
 * instance of class is created in the static block that provides option for exception handling.
 *
 * Both eager initialization and static block initialization creates the instance even before it’s being used
 * and that is not the best practice to use.
 */
public class SingleTonEagerInitStatic {
    private static final SingleTonEagerInitStatic INSTANCE;

    static //static block initialization for exception handling
    {
        try {
            INSTANCE = new SingleTonEagerInitStatic();
        } catch (Exception exception) {
            throw new RuntimeException("Failed initializing Singleton INSTANCE");
        }
    }

    private SingleTonEagerInitStatic() {}

    public static SingleTonEagerInitStatic getInstance() {
        return INSTANCE;
    }

}
