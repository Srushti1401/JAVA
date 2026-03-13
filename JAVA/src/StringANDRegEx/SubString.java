package StringANDRegEx;

public class SubString {

    public static void main(String[] args) {

        String order = "ORD20251234";

        String year = order.substring(3,7);
        String orderNumber = order.substring(7);

        System.out.println("Year: " + year);
        System.out.println("Order Number: " + orderNumber);
    }
}