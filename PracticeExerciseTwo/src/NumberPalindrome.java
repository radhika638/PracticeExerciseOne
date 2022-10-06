public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        //number = 12121
        int rNumber = number;
        int reverse = 0;
        int n = 0;
        int num = 0;
        while (number != 0){
            n = number % 10;
            reverse = reverse + n;
            num = reverse * 10;
            reverse = num;
            number = number/10;
        }
        num = num/10;
        System.out.println(num);
        if(rNumber == num){
            return true;
        }
        else {
            return false;
        }
    }
}
