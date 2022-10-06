public class Sum3and5 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i<=1000; i++){
            int divisibleBy3 = i % 3;
            if(divisibleBy3 == 0){
                int divisibleBy5 = i % 5;
                if(divisibleBy5 == 0){
                    System.out.println("Found number = " + i);
                    sum = sum + i;
                    count++;
                    if(count == 5){
                        break;
                    }
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
