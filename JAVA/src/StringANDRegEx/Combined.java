package StringANDRegEx;

import java.util.Scanner;

public class Combined {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter courses (comma separated): ");
        String courses = sc.nextLine();

        // username generation
        String username = name.toLowerCase().replace(" ", ".");

        System.out.println("Username: " + username);

        // email validation
        if(email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");

        // split courses
        String[] courseList = courses.split(",");

        System.out.println("Courses:");

        for(String c : courseList){
            System.out.println(c);
        }
    }
}