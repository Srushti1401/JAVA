package SCENARIOS;

import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nRight Triangle");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nInverted Right Triangle");

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nLeft Triangle");

        for(int i=1;i<=n;i++){

            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\nEquilateral Triangle");

        for(int i=1;i<=n;i++){

            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }

            System.out.println();
        }

        System.out.println("\nInverted Left Triangle");

        for(int i=1;i<=n;i++){

            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            for(int k=i;k<=n;k++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\nInverted Equilateral Triangle");

        for(int i=1;i<=n;i++){

            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            for(int k=i;k<=n;k++){
                System.out.print(" *");
            }

            System.out.println();
        }

        System.out.println("\nDiamond");

        for(int i=1;i<=n;i++){

            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }

            System.out.println();
        }

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int k=i;k<=n;k++){
                System.out.print(" *");
            }

            System.out.println();
        }

        sc.close();
    }
}