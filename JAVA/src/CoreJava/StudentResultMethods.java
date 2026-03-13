package CoreJava;

import java.util.*;

public class StudentResultMethods {

    static int calculateTotal(int[] marks){
        int total = 0;
        for(int m : marks)
            total += m;
        return total;
    }

    static double calculateAverage(int total, int n){
        return (double) total / n;
    }

    static String calculateResult(int[] marks){

        for(int m : marks){
            if(m < 35)
                return "Fail";
        }

        return "Pass";
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter mark for subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = calculateTotal(marks);
        double avg = calculateAverage(total, n);
        String result = calculateResult(marks);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + avg+"%");
        System.out.println("Result: " + result);

        sc.close();
    }
}