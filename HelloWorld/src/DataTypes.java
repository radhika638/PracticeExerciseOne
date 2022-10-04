public class DataTypes {

    public static void main(String[] args){

        //INT
        int myInteger = 10000;
        int myMinimumIntValue = Integer.MIN_VALUE;
        int myMaximumIntValue = Integer.MAX_VALUE;
        System.out.println("My minimum int value = " + myMinimumIntValue);
        System.out.println("My maximum int value = " + myMaximumIntValue);
        System.out.println("My busted minimum int value = " + (myMinimumIntValue - 1));
        System.out.println("My busted maximum int value = " + (myMaximumIntValue + 1));

        //BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My minimum byte value = " + myMinByteValue);
        System.out.println("My maximum byte value = " + myMaxByteValue);

        //SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My minimum short value = " + myMinShortValue);
        System.out.println("My maximum short value = " + myMaxShortValue);

        //LONG
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My minimum long value = " + myMinLongValue);
        System.out.println("My maximum long value = " + myMaxLongValue);

        long myLongValue = 100;
        System.out.println("My long value = " + myLongValue);
        long myBigLongLiteralValue = 2_123_145_998_990L;
        System.out.println("My big long literal value = " + myBigLongLiteralValue);

        //CHALLENGE
        short shortLiteralValue = 32767;
        System.out.println(shortLiteralValue);

        int myNewInteger = myInteger/2;
        System.out.println(myNewInteger);
        byte myByteVariable = myMaxByteValue;
        System.out.println("My byte variable = " + myByteVariable);
        short myShortVariable = myMaxShortValue;
        System.out.println("My short variable = " + myShortVariable);
        int myIntVariable = myInteger;
        System.out.println("My int variable = " + myIntVariable);
        long myLongVariable = 50000 + (10 * (myByteVariable + myShortVariable + myIntVariable));
        System.out.println("My long variable = " + myLongVariable);
    }
}
