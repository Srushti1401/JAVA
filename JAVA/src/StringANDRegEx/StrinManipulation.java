package StringANDRegEx;

import java.util.Scanner;

public class StrinManipulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String name = sc.nextLine();

        name = name.trim();                 // remove extra spaces
        name = name.toLowerCase();          // convert to lowercase
        name = name.replace(" ", ".");      // replace spaces

        System.out.println("Username: " + name);
    }
}