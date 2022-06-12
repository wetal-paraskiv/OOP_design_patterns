package anonymousClass;

public class Main {
    public static void main(String[] args) {

        // anonymous class
        Animal anonymousAnimal = new Animal(){
            @Override
            public void makeNoise() {
                System.out.println("Anonymous class instance making noise!");
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am anonymous runnable");
            }
        };

        anonymousAnimal.setName("cola");
        anonymousAnimal.setAge(2);

        System.out.println(anonymousAnimal);
        anonymousAnimal.makeNoise();

        runnable.run();
    }
}
