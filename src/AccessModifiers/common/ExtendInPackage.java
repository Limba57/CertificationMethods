package AccessModifiers.common;

public class ExtendInPackage extends Common {

    public static void main(String[] args) {
        ExtendInPackage extendInPackage = new ExtendInPackage();

        extendInPackage.publicPrint();
        extendInPackage.protectedPrint();
        extendInPackage.defaultPrint();
        //extendInPackage.privatePrint();

    }
}
