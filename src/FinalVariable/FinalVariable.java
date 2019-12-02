package FinalVariable;

import java.util.ArrayList;
import java.util.List;

public class FinalVariable {

    private static final int SIZE = 10;

    private static final List<String> VALUES = new ArrayList<>();

    public static void main(String[] args) {

        int[] myArray = new int [SIZE];

        final int test;

        test = 23;
        System.out.println(test);
        // test = 24; no compilation, can't assign a final again
        System.out.println(test);


        // SIZE = 11; //no compilation, can't assign a final again
        // SIZE++; //no compilation, can't assign a final again

        for (int i = 0; i < SIZE; i++) {
            System.out.println(myArray[i]);
        }

        VALUES.add("one");
        VALUES.add("two");
        System.out.println(VALUES);
        VALUES.remove(0);
        System.out.println(VALUES);
        VALUES.add("three");
        System.out.println(VALUES);
        VALUES.set(1, "four");
        System.out.println(VALUES);

        // VALUES = new ArrayList<>(); // no compilation
        List<String> anotherValues = new ArrayList<>();
        // VALUES = anotherValues; // no compilation

    }
}
