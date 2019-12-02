package AccessModifiers.common.insideCommon;

import AccessModifiers.common.Common;

public class InsideCommon {

    public static void main(String[] args) {

        Common common = new Common();
        common.publicPrint();
        //common.protectedPrint();
        //common.defaultPrint();
        //common.privatePrint();

        System.out.println(common.publicNum);
        //System.out.println(common.protectedNum);
        //System.out.println(common.defaultNum);
        //System.out.println(common.privateNum);
    }

}
