package StringANDRegEx;

public class Replace {

    public static void main(String[] args) {

        String message = "This movie is bad and stupid";

        message = message.replace("bad", "***");
        message = message.replace("stupid", "***");

        System.out.println(message);
    }
}