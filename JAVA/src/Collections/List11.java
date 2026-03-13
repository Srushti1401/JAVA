package Collections;

import java.util.*;

public class List11 {

    public static void main(String[] args) {

        List<String> courses = new ArrayList<>();

        // add
        courses.add("Java");
        courses.add("Python");
        courses.add("DBMS");

        System.out.println("Courses: " + courses);

        // size
        System.out.println("Total courses: " + courses.size());

        // get
        System.out.println("First course: " + courses.get(0));

        // set (update)
        courses.set(1, "Machine Learning");

        System.out.println("Updated list: " + courses);

        // contains
        if(courses.contains("Java"))
            System.out.println("Java course available");

        // remove
        courses.remove("DBMS");

        System.out.println("After removal: " + courses);

        // isEmpty
        System.out.println("Is list empty? " + courses.isEmpty());

        // clear
        courses.clear();

        System.out.println("After clear: " + courses);
    }
}