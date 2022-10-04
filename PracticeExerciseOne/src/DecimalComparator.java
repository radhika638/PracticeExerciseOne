public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double dub1, double dub2){
        int num1 = (int)(dub1 * 1000);
        int num2 = (int)(dub2 * 1000);

        if(num1 == num2){
            return true;
        }
        else {
            return false;
        }
    }
}
