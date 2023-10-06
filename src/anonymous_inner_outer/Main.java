package anonymous_inner_outer;

public class Main {
    public static void main(String[] args) {
        new Animal() { // anonymous Animal
            @Override
            public void makeNoise() {
                System.out.println("Anonymous Animal.class INSTANCE making noise!");
            }
        }.makeNoise();

        new Runnable() { // anonymous Runnable
            @Override
            public void run() {
                System.out.println("I am anonymous Runnable");
            }
        }.run();


        // inner, outer classes
        Outer outer = new Outer();
        outer.whatsUp();

        Outer.Inner innerClass = outer.new Inner();
        innerClass.whatsUp();

        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.whatsUp();
    }
}

class Animal {
    public void makeNoise() {
        System.out.println("Animal is making noise!");
    }
}
