package MethodsWithVariableArguments;

import java.util.Arrays;

public class MethodsWithVariableArguments {

    public void jump1(int... numbers) {

    }

    public void jump2(int start, int... numbers) {

    }



    //public void jump3(int... numbers, String... words) {
    // only one at the end
    //}


    public static void main(String[] args) {

        jump(1,1);
        jump(1, 1, 1, 1, 1, 1);
        int[] nums = {1, 1, 1, 1};
        jump(1, nums);
        jump(1,new int[] {1,2,3});
        //jump(2,null);

        jump3(1, 2, 3, 4);
        jump3();
        jump3(11,22,33,44,56,34,78,34,89,45);


    }

    public static void jump(int start, int... numbers) {
        System.out.println("start = "+ start+ " number lenght = "+numbers.length);
        System.out.println("type "+ numbers.getClass());

    }

    public static void jump3(int... numbers) {
        System.out.println("number lenght: "+numbers.length);
        System.out.println("type "+ numbers.getClass());
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
        System.out.println(Arrays.toString(numbers));
    }

}
