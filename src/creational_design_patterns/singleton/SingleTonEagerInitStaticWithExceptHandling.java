package creational_design_patterns.singleton;

/**
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of class is created in the static block that provides option for exception handling.
 *
 * Both eager initialization and static block initialization creates the instance even before it’s being used and
 * that is not the best practice to use.
 */
public class SingleTonEagerInitStaticWithExceptHandling {

    //static block initialization for exception handling
    private static SingleTonEagerInitStaticWithExceptHandling instance;
    static
    {
        try {
            instance = new SingleTonEagerInitStaticWithExceptHandling();
        } catch (Exception exception) {
            throw new RuntimeException("Failed initializing Singleton instance");
        }
    }

    private SingleTonEagerInitStaticWithExceptHandling() {}

    public SingleTonEagerInitStaticWithExceptHandling getInstance() {
        return instance;
    }

}
