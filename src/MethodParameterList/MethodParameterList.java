package MethodParameterList;

public class MethodParameterList {

    int getZero() { // no arguments (niladic)
        return  0;
    }

    int increment(int number) { // 1 argument (monadic)
        return number+1;
    }

    int sum(int a, int b) { // 2 arguments (diadic)
        return a + b;
    }

    int plusMinus(int a, int b, int c) {
        return a + b - c; // 3 arguments (triadic)
    }

    double average(double a,double b,double c,double d) {
        return (a + b + c + d) / 4.0;
    } // 4 arguments (polyadic)

//    void {} // no compilation: no bracket

    void test(int a,int b){}

//    void test2(int a); // no compilation: no curly bracket



}
