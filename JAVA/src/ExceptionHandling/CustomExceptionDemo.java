package ExceptionHandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount {

    double balance = 3000;

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful");
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if(amount > balance){
            throw new InsufficientBalanceException("Not enough balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful");
    }

    void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice;

        do{

            System.out.println("\n---- ATM MENU ----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try{

                switch(choice){

                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double d = sc.nextDouble();
                        account.deposit(d);
                        break;

                    case 2:
                        System.out.print("Enter withdraw amount: ");
                        double w = sc.nextDouble();
                        account.withdraw(w);
                        break;

                    case 3:
                        account.checkBalance();
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice");

                }

            }

            catch(InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }

        }while(choice != 4);

    }
}