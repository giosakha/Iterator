package stack;

import java.util.*;


//ITERATOR
public class Main {
    public static void main(String[] args) {
        // Create a collection of strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Obtain an Iterator instance from the collection
        Iterator <String>iterator = names.iterator();

        // Iterating through the collection using the Iterator
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Bob")) {
                iterator.remove(); // Remove "Bob" from the collection
            }
        }

        // Print the modified collection
        System.out.println(names);
    }
}   
//listiterator
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Heidi");
        list.add("Hannah");

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
//forEach()

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        list.forEach(element -> {
            System.out.println(element);
        });
    }
}

