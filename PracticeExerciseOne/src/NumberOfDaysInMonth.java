public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if((year >= 1) && (year <= 9999)) {
            int divisibleByFour = year % 4;
            int divisibleByHundred = year % 100;
            int divisibleByFourHundred = year % 400;

            if (divisibleByFour == 0){
                if (divisibleByHundred == 0){
                    if(divisibleByFourHundred == 0){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else{
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if((month > 12 || month < 1) || (year > 9999 || year < 1)){
            return -1;
        }
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }
                else
                    return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
    }
}
