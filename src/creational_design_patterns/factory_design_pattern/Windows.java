package creational_design_patterns.factory_design_pattern;

public class Windows implements OS {
    @Override
    public void getSpecification() {
        System.out.println("Most Windowed operating system.");
    }
}
