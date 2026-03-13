package StringANDRegEx;

import java.util.Scanner;

public class RegEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        boolean valid = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");

        if(valid)
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");
    }
}