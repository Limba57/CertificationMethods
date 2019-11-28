package MethodReturnType;

public class MethodReturnType {

    public void jump() {
    } // return type void

    public void jump2() {
        return; // valid but redondant
    }

    public String jump3() {
        return "";
    }

//    public String jump4(){} // no compilation: no return statement

//    public jump5(){} // no compilation: no return type

    String jump6(int a) {
        if (a == 5) {
            return "";
        }
        return "abc";
    }

    int getInt() {
        return 9;
    }

    int getLong() {
//        return 9L; // no compilation: inccompatible type
        return (int) 9L;
    }

    int expanded() {
        int temp = 10;
        return temp;
    }

    boolean isTrue() {
        return 5 > 10;
    }

    boolean istrueToo() {
        return 5 == 6;
    }

    public void test() {

    }

//    public void 2test() {} // pas de chiffre en premier

//    public void void() {}  // pas de mot clef

    public String string(){return "";}

    public String String(){return "";}

    public void _test(){}

    public void $test(){}





}
