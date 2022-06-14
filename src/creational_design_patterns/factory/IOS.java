package creational_design_patterns.factory;

public class IOS implements OS {
    @Override
    public void getSpecification() {
        System.out.println("Most Secure operating system.");
    }
}
