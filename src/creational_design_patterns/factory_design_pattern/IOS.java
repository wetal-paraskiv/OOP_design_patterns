package creational_design_patterns.factory_design_pattern;

public class IOS implements OS {
    @Override
    public void getSpecification() {
        System.out.println("Most Secure operating system.");
    }
}
