package iterator_design_pattern;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CourseRepository implements Iterable<String>{

    private int index;
    private String[] courses;

    public CourseRepository() {
        index = 0;
        courses = new String[0];
    }

    public void addCourse(String newCourse) {
        if (index == courses.length) {
            System.out.println("Adding new item: " + newCourse);
            String[] coursesPlusOne = new String[courses.length + 1];
            System.arraycopy(courses, 0, coursesPlusOne, 0, courses.length);
            courses = coursesPlusOne;
            coursesPlusOne = null;
        }
        courses[index] = newCourse;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < courses.length;
            }

            @Override
            public String next() {
                return courses[currentIndex++];
            }
        };
        return iterator;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }
}
