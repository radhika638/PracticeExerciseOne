public class DataTypes2 {

    public static void main(String[] args){

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        int myInt = 5 / 3;

        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myInt);

        //CHALLENGE
        //Convert a given number of pounds to kilograms

        double pounds = 265.567734545d;
        double kilograms = pounds * 0.45359237d;
        System.out.println("kilograms = " + kilograms);

        //CHAR
        char myChar = 'c';
        char myUniCodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUniCodeChar);
        char myCopyRightChar = '\u00A9';
        System.out.println(myCopyRightChar);

        //BOOLEAN
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
