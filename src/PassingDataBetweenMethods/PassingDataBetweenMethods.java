package PassingDataBetweenMethods;

import PassingDataBetweenMethods.test.Test;

import java.util.ArrayList;
import java.util.List;

public class PassingDataBetweenMethods {

    public static void main(String[] args) {
        int number =4;
        System.out.println("number = " + number);
        newNumbers(5);
        System.out.println("number = " + number);
        newNumbers(number);
        System.out.println("number = " + number);

        String name = "Seb";
        System.out.println("name = " + name);
        newName(name);
        System.out.println("name = " + name);

        StringBuilder sb = new StringBuilder();

        build(sb);
        System.out.println("stringbuilder sb = " + sb);

        List<String> list = new ArrayList<>();
        list.add("ds main");
        addString(list);
        System.out.println(list);

        int[] array = {0, 1, 2, 3};
        System.out.println(array[3]);
        change(array);
        System.out.println(array[3]);

        Test.addTest(list);
        System.out.println(list);
    }

    public static void newNumbers(int number) {
        System.out.println("in newNumber number = "+number);
        number = 10;
        System.out.println("in newNumber number = "+number);
    }

    public static void newName(String name) {
        System.out.println("in newName = " + name);
        name = "Arthur";
        System.out.println("in newName = " + name);
    }

    public static void build(StringBuilder s) {
        s.append("Tom");
    }

    public static void addString(List li) {
        li.add("in method");
    }

    public static void change(int[] a) {
        a[3] = 4;
    }
}
