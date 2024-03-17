import java.util.Iterator;

// Ahmad Reshad Yadgari SDEV301

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Creating instances of ArrayIntList and LinkedIntList
        IntList list1 = new ArrayIntList();
        IntList list2 = new LinkedIntList();

        // Adding elements to ArrayIntList
        list1.addBack(42);
        list1.addBack(82);
        list1.addBack(97);
        // Removing the last element
        list1.removeBack();
        // Adding an element to the front
        list1.addFront(1000);

        // Displaying the ArrayIntList
        System.out.println("ArrayIntList: " + list1);

        // Iterating over ArrayIntList using enhanced for-loop
        System.out.println("Iterating over ArrayIntList:");
        for (int value : list1) {
            System.out.println(value);
        }

        System.out.println("---------");

        // Iterating over ArrayIntList using Iterator explicitly
        System.out.println("Iterating over ArrayIntList with Iterator:");
        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            int value = itr.next();
            System.out.println(value);
        }

        // Testing LinkedIntList
        System.out.println("-----------------------");

        // Adding elements to LinkedIntList
        list2.addFront(9);
        list2.addFront(7);
        list2.addFront(4);
        list2.addBack(18);

        // Displaying the LinkedIntList
        System.out.println("LinkedIntList: " + list2);

        // Iterating over LinkedIntList using enhanced for-loop
        System.out.println("Iterating over LinkedIntList:");
        for (int value : list2) {
            System.out.println(value);
        }

        // Iterating over LinkedIntList using Iterator explicitly
        System.out.println("Iterating over LinkedIntList with Iterator:");
        Iterator<Integer> itr2 = list2.iterator();
        while (itr2.hasNext()) {
            int value = itr2.next(); // Corrected to retrieve the next value
            System.out.println(value);
        }
    }
}
