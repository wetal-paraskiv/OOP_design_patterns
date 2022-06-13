package creational_design_patterns.singleton;

/**
 * Initialization-on-demand holder idiom = Bill Pugh Singleton Implementation
 * This is the most widely used approach for Singleton class as it doesn't require synchronization
 * <p>
 * When the class SingleTon is loaded by the JVM, the class goes through initialization.
 * Since the class does not have any static variables to initialize, the initialization completes trivially.
 * The static class definition Holder within it is not initialized until the JVM determines that Holder must be executed.
 * The inner static class Holder is only executed when the static method getInstance is invoked on the class SingleTon,
 * and the first time this happens the JVM will load and initialize the Holder class.
 * The initialization of the Holder inner class results in static variable INSTANCE being initialized by executing
 * the (private) constructor for the outer class Something.
 * Since the class initialization phase is guaranteed by the JLS to be sequential, i.e., non-concurrent,
 * no further synchronization is required in the static getInstance method during loading and initialization.
 * And since the initialization phase writes the static variable INSTANCE in a sequential operation,
 * all subsequent concurrent invocations of the getInstance will return the same correctly initialized INSTANCE
 * without incurring any additional synchronization overhead.
 * Caveats
 * While the implementation is an efficient thread-safe "creational_design_patterns.singleton" cache without synchronization overhead,
 * and better performing than uncontended synchronization,[4] the idiom can only be used when the construction
 * of Something is guaranteed to not fail. In most JVM implementations, if construction of Something fails,
 * subsequent attempts to initialize it from the same class-loader will result in a NoClassDefFoundError failure.
 */
public class SingleTonLazyInitHolderIdiom {

    private SingleTonLazyInitHolderIdiom() {
    }

    // private inner static class that contains the instance of the creational_design_patterns.singleton class.
    private static class LazyHolder {
        static final SingleTonLazyInitHolderIdiom INSTANCE = new SingleTonLazyInitHolderIdiom();
    }

    public static SingleTonLazyInitHolderIdiom getInstance() {
        return LazyHolder.INSTANCE;
    }

}

