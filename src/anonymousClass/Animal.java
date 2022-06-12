package anonymousClass;

public class Animal {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("Animal is making noise!");
    }

    @Override
    public String toString() {
        return "Animal{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
