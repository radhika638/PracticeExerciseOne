public class ForLoop {

    public static void main(String[] args) {

        for(int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        boolean isPrime = isPrime(7);
        if(isPrime){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }

        int count = 0;
        for(int i = 50; i <= 100; i++){
           isPrime = isPrime(i);
           if(isPrime){
               System.out.println("Number " + i +" is a prime number");
               count++;
               if(count == 3){
                   break;
               }
           }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
