package Collections;

import java.util.*;

public class SetEventRegistration {

    public static void main(String[] args) {

        Set<String> participants = new HashSet<>();

        // add
        participants.add("Rahul");
        participants.add("Anita");
        participants.add("Kiran");
        participants.add("Rahul"); // duplicate

        System.out.println("Participants: " + participants);

        // size
        System.out.println("Total participants: " + participants.size());

        // contains
        if(participants.contains("Anita"))
            System.out.println("Anita is registered");

        // iterator
        Iterator<String> it = participants.iterator();

        while(it.hasNext()){
            System.out.println("Participant: " + it.next());
        }

        // remove
        participants.remove("Kiran");

        System.out.println("After removal: " + participants);

        // isEmpty
        System.out.println("Is set empty? " + participants.isEmpty());
    }
}