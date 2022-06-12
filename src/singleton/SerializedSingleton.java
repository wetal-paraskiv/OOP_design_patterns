package singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private SerializedSingleton() {}

    private static class Holder{
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return Holder.INSTANCE;
    }

    // to prevent creating new object after deserializing
    protected Object readResolve() {
        return getInstance();
    }
}
