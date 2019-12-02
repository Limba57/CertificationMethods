package StaticMethodsAndFields;

public class Launcher {

    public static void main(String[] args) {

        StaticMethodsAndFields.main(args);

        System.out.println(StaticMethodsAndFields.myNum);

        StaticMethodsAndFields.staticPrint();

        AnotherMain.main(args);


    }

}
