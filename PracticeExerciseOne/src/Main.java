public class Main {
    public static void main(String[] args) {

         SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(3000);

        boolean isBarking = BarkingDog.shouldWakeUp(true, 23);
        if(isBarking){
            System.out.println("Dog is barking, wake up");
        }
        else {
            System.out.println("No need to wake up");
        }

        boolean isLeapYear = LeapYear.isLeapYear(9000);
        if(isLeapYear){
            System.out.println("It is leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

       boolean decimalComparator = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
       if(decimalComparator){
           System.out.println("True");
       }
       else {
           System.out.println("False");
       }

       boolean hasEqualSum = EqualSumChecker.hasEqualSum(1,-1,0);
       if(hasEqualSum){
           System.out.println("Has equal sum");
       }
       else {
           System.out.println("Has no equal sum");
       }

        boolean hasTeen = TeenNumberChecker.hasTeen(22, 23, 34);
        if(hasTeen){
            System.out.println("Has teen");
        }
        else {
            System.out.println("Has no teen");
        }

        boolean isTeen = TeenNumberChecker.isTeen(13);
        if(isTeen){
            System.out.println("Is teen");
        }
        else {
            System.out.println("Is not teen");
        }

        MinutesToYearsAndDay.printYearsAndDays(51951529895L);

        boolean isCatPlaying = PlayingCat.isCatPlaying(false, 35);
        if(isCatPlaying){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        NumberInWord.printNumberInWord(54954);

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 9000));
    }
}