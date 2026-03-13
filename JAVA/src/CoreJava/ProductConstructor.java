package CoreJava;

import java.util.Scanner;
import java.util.InputMismatchException;

class ProductConstructor {

    int productId;
    String productName;
    double price;
    int quantity;

    ProductConstructor(int id, String name, double p, int q){
        productId = id;
        productName = name;
        price = p;
        quantity = q;
    }

    double calculateStockValue(){
        return price * quantity;
    }

    void display(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Stock Value: " + calculateStockValue());
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int id = 0;

        while(true){
            try{
                System.out.print("Enter Product ID (number): ");
                id = sc.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next(); // clear wrong input
            }
        }

        System.out.print("Enter Product Name: ");
        String name = sc.next();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        ProductConstructor p = new ProductConstructor(id, name, price, quantity);

        System.out.println("\nProduct Details:");
        p.display();

        sc.close();
    }
}