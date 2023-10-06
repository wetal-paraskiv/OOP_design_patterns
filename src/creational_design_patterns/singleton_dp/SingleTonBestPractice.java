package creational_design_patterns.singleton_dp;

public class SingleTonBestPractice {
    private static volatile SingleTonBestPractice INSTANCE = null;

    private SingleTonBestPractice() {
    }

    public static SingleTonBestPractice getInstance() {
        SingleTonBestPractice result = INSTANCE;

        if (result == null) {
            synchronized (SingleTonBestPractice.class) {
                result = INSTANCE;

                if (result == null) {
                    INSTANCE = result = new SingleTonBestPractice();
                }
            }
        }
        return result;
    }
}
