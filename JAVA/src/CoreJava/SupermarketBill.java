package CoreJava;

import java.util.*;

public class SupermarketBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        String[] items = new String[n];
        double[] price = new double[n];
        int[] qty = new int[n];
        double[] itemTotal = new double[n];

        double total = 0;

        for(int i=0;i<n;i++){
            System.out.print("Item name: ");
            items[i] = sc.next();

            System.out.print("Price: ");
            price[i] = sc.nextDouble();

            System.out.print("Quantity: ");
            qty[i] = sc.nextInt();

            itemTotal[i] = price[i] * qty[i];
            total += price[i]*qty[i];
        }
        // Bill display
        System.out.println("\n----- BILL DETAILS -----");

        for(int i = 0; i < n; i++) {

            System.out.println(items[i] + "  " + price[i] + " x " + qty[i] + " = " + itemTotal[i]);

        }

        double discount=0;

        if(total>5000)
            discount = total*0.20;
        else if(total>2000)
            discount = total*0.10;

        double afterDiscount = total-discount;

        // Tax (GST)
        double taxRate = 0.05;   // 5%
        double tax = afterDiscount * taxRate;

        double finalBill = afterDiscount + tax;

        System.out.println("Total Bill: "+total);
        System.out.println("Discount: "+discount);
        System.out.println("Tax (5%): " + tax);
        System.out.println("Final Bill: "+finalBill);
    }
}