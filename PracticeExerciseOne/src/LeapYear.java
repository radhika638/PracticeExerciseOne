public class LeapYear {
    public static boolean isLeapYear(int year) {
        if((year >= 1 && year <= 9999)){
            int divisor = year % 4;
            if(divisor == 0) {
                divisor = year % 100;
                if(divisor == 0){
                    divisor = year % 400;
                    if(divisor == 0){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
