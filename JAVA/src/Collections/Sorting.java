package Collections;

import java.util.*;

public class Sorting{
    public static void main(String[] args){

        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(78);
        marks.add(90);
        marks.add(65);

        Collections.sort(marks);

        System.out.println(marks);
    }
}