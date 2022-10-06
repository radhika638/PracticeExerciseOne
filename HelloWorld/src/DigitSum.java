public class DigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in 125 is " + sumDigits(1258));
    }

    private static int sumDigits(int number){

        if(number<10){
            return -1;
        }
        int n;
        int sum = 0;
        while (number > 0){
            n = number % 10;
            sum = sum + n;
            number = number/10;
        }
        return sum;
    }
}
