package AccessModifiers;

import AccessModifiers.common.Common;

public class ExtendCommon extends Common {



    public static void main(String[] args) {

        ExtendCommon extendCommon = new ExtendCommon();

        extendCommon.publicPrint();
        extendCommon.protectedPrint();
        //extendCommon.defaultPrint();
        //extendCommon.privatePrint();

        System.out.println(extendCommon.publicNum);
        System.out.println(extendCommon.protectedNum);
        //System.out.println(extendCommon.defaultNum);
        //System.out.println(extendCommon.privateNum);
    }
}
