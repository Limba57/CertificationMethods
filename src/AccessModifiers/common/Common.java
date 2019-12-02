package AccessModifiers.common;

public class Common {

    public int publicNum = 10;
    protected int protectedNum = 20;
    int defaultNum = 30;
    private int privateNum = 40;

    public void publicPrint() {
        System.out.println("public");
    }

    protected void protectedPrint() {
        System.out.println("protected");
    }

    void defaultPrint() {
        System.out.println("defaut");
    }

    private void privatePrint() {
        System.out.println("private");
    }

    public static void main(String[] args) {

        Common common = new Common();

        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        common.privatePrint();

        System.out.println(common.publicNum);
        System.out.println(common.protectedNum);
        System.out.println(common.defaultNum);
        System.out.println(common.privateNum);
    }
}
