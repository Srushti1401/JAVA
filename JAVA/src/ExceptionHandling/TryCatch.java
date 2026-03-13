package ExceptionHandling;

import java.util.*;

class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        try {

            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if(amount > balance){
                throw new Exception("Insufficient Balance");
            }

            balance -= amount;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);

        }

        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter numbers only.");
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}