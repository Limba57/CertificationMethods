package OverloadingMethods;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class OverloadingMethods {

    public void walk(int miles){}

    public void walf(short feet){}

    public boolean walk() {
        return false;
    }

    void walk(int miles, short feet){}

    public void walk(float miles){}
    // public int walk(float miles){} // no complilation same type
    // public void walk(float km){} // no compilation same type
    // public static void walk(float miles) {} // no compilation same type

    public void walk(int[] lenght){}
    // public void walk(int... lenght){} // int [] and int... are same type

    public static void main(String[] args) {

        byte b = 9;
        run(b);
        run(9);

        run(9.4);
        run(9L);

        Integer objectInteger = 9;
        run(objectInteger);
        run(new Integer(9));
        Double objectDouble = 9.4;
        Float objectFloat = 9.4F;
        run(objectDouble);
        run(objectFloat);

        System.out.println("-----");

        jump("test");
        jump(25);

        System.out.println("-----");

        sum(1, 2);

    }

    /*public static int sum(int a, int b) {
        System.out.println("int sum");
        return a + b;
    }
    public static long sum(long a, long b) {
        System.out.println("long sum");
        return a + b;
    }
    public static Integer sum(Integer a, Integer b) {
        System.out.println("Integer");
        return a + b;
    }*/
    public static int sum(int... numbers) {
        System.out.println("int...");
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static void run(int lenght){
        System.out.println("int");
    }
    public static void run(Integer lenghtInteger){
        System.out.println("Integer");
    }
    public static void run(double kilometer){
        System.out.println("double");
    }

    public static void jump(String s) {
        System.out.println("string");
    }
    public static void jump(Object o) {
        System.out.println("object");
    }




}
