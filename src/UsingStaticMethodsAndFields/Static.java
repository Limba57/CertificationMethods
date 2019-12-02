package UsingStaticMethodsAndFields;

public class Static {

    private String name = "Static";

    public static void one() {

    }

    public static void two() {

    }

    public static void three() {
        one();
        two();
        // four(); four() is not a static methods so can't be call in a static context
        //System.out.println(name); name is not a static field
    }

    public void four() {
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        three();
        //four(); // not a static method

        Static myInstance = new Static();
        myInstance.four();

        new Static().four();
    }

}
