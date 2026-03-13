package StringANDRegEx;

public class Split {

    public static void main(String[] args) {

        String log = "ERROR:FileNotFound:Server1";

        String[] parts = log.split(":");

        System.out.println("Error Type: " + parts[0]);
        System.out.println("Message: " + parts[1]);
        System.out.println("Server: " + parts[2]);
    }
}