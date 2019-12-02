package StaticInitialization;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

    private static final int SIZE;

    private static int one;

    private static final int two;

    private static final int three = 3;

    private static final List<String> NAMES = new ArrayList<>();

    // private static final List<String> NAMES2; no compilation --> no initialization

    static {
        System.out.println("first static init ");
        int rows = 5;
        int columns = 4;
        SIZE = rows * columns;
    }

    static {
        System.out.println("second static initializer");
        one = 1;
        two = 2;
        // three = 4; // no compilation
        // SIZE = 2; // no compilation
        // two = 3; // no compilation
    }

    static {
        System.out.println("third static init");
        NAMES.add("Seb");
        NAMES.add("Arthur");
    }

    public static void main(String[] args) {

        System.out.println(NAMES);

        StaticInitialization staticInitialization = new StaticInitialization();

        System.out.println(staticInitialization.NAMES);

    }
}
