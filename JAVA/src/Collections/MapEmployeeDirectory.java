package Collections;

import java.util.*;

public class MapEmployeeDirectory {

    public static void main(String[] args) {

        Map<Integer,String> employees = new HashMap<>();

        // put
        employees.put(101,"Rahul");
        employees.put(102,"Anita");
        employees.put(103,"Kiran");

        System.out.println("Employees: " + employees);

        // size
        System.out.println("Total employees: " + employees.size());

        // get
        System.out.println("Employee with ID 101: " + employees.get(101));

        // containsKey
        if(employees.containsKey(102))
            System.out.println("Employee ID 102 exists");

        // containsValue
        if(employees.containsValue("Kiran"))
            System.out.println("Kiran found");

        // keySet
        System.out.println("All IDs: " + employees.keySet());

        // values
        System.out.println("All names: " + employees.values());

        // entrySet
        for(Map.Entry<Integer,String> entry : employees.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // remove
        employees.remove(103);

        System.out.println("After removal: " + employees);
    }
}