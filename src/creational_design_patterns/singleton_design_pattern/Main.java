package creational_design_patterns.singleton_design_pattern;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyThread());
            thread.start();
        }

        // test serializable creational_design_patterns.singleton
        SerializedSingleton serializedSingleton = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("fileForSerialized.ser"));
        out.writeObject(serializedSingleton);
        out.close();

        //deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("fileForSerialized.ser"));
        SerializedSingleton deserializedSingleton = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + serializedSingleton.hashCode());
        System.out.println("instanceTwo hashCode=" + deserializedSingleton.hashCode());


        /**
         * Reflection can be used to destroy all the above creational_design_patterns.singleton implementation approaches.
         */
        SingleTonEagerInit instanceOne = SingleTonEagerInit.getInstance();
        SingleTonEagerInit instanceTwo = null;
        try {
            Constructor[] constructors = SingleTonEagerInit.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the creational_design_patterns.singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (SingleTonEagerInit) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

    }
}
