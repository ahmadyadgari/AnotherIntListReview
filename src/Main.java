// Ahmad Reshad Yadgari SDEV301
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        IntList list1 = new ArrayIntList();
        IntList list2 = new LinkedIntList();


        // add 3 ints to the back of the list
        list1.addBack(42);
        list1.addBack(82);
        list1.addBack(97);

        System.out.println(list1);

    }
}