package creational_design_patterns.singleton_dp;

/**
 * Not thread SAFE!!!
 * This implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems,
 * it can cause issues if multiple threads are inside the if condition at the same time.
 * It will destroy the creational_design_patterns.singleton pattern and both threads will get the different INSTANCEs.
 */
public class SingleTonLazyInit {

    private static SingleTonLazyInit INSTANCE;

    private SingleTonLazyInit() {}

    public static SingleTonLazyInit getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTonLazyInit();
        }
        return INSTANCE;
    }
}
