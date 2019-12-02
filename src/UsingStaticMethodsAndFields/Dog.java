package UsingStaticMethodsAndFields;

public class Dog {

    public static int count = 0;

    public static void incrementCounter() {
        count++;
    }

    public String name;

    public Dog() {
        this.name = "";
    }

    public Dog(String name) {
        this.name = name;
    }
}
