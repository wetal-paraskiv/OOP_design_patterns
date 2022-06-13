package iterator_design_pattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CourseRepository courseRepository = new CourseRepository();

        courseRepository.addCourse("Mathematics");
        courseRepository.addCourse("Geometry");
        courseRepository.addCourse("Informational Technology");

        System.out.println("\tlet's iterate over the courseRepository...");
        Iterator<String> iterator = courseRepository.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
