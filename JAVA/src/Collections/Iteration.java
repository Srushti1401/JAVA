package Collections;

import java.util.*;

public class Iteration{
    public static void main(String[] args){

        ArrayList<String> items=new ArrayList<>();

        items.add("Laptop");
        items.add("Mouse");
        items.add("Keyboard");

        for(String i:items)
            System.out.println(i);
    }
}