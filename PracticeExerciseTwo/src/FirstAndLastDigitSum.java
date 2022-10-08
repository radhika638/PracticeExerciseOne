public class FirstAndLastDigitSum {
    //Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    //The method needs to find the first and the last digit of the parameter number passed to the method, using a loop
    // and return the sum of the first and the last digit of that number.
    //If the number is negative then the method needs to return -1 to indicate an invalid value.
    //Example input/output
    //* sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
    //* sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int num1 = 0;
        int num2 = 0;
        int num = 0;
        int sum = 0;
        int count = 0;
        while (number > 0){
            num = number%10;
            if(number == num){
                num2 = number;
            }
            count++;
            if(count == 1){
                num1 = num;
            }
            number = number/10;
        }
        sum = num1 + num2;
        return sum;
    }
}
