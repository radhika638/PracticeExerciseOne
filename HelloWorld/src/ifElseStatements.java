public class ifElseStatements {

    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if((topScore>secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore>90) || (secondTopScore<=90)){
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("was car is true");
        }

        //CHALLENGE
        double doubleVariable = 20.00d;
        double secondDoubleVariable = 80.00d;
        double result = (doubleVariable+secondDoubleVariable)*100.00d;
        System.out.println("My total value =" + result);
        double modulus = result % 40.00d;
        System.out.println(modulus);
        boolean value = (modulus == 0) ? true : false;
        if(!value){
            System.out.println("Got some reminder");
        }

        /**if(modulus == 0){
            value = true;
        }
        if(modulus == 1){
            value = false;
            if (!value){
                System.out.println("Got some remainder");
            }
        }*/
    }
}


