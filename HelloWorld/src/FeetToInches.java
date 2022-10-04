public class FeetToInches {

    public static void main(String[] args) {
        double centimetersCalculated = calcFeetAndInchesToCentimeters(12345);
        System.out.println(centimetersCalculated);

        centimetersCalculated = calcFeetAndInchesToCentimeters(7, 12);
        if(centimetersCalculated < 0){
            System.out.println("Invalid feet or inches");
            return;
        }
        System.out.println(centimetersCalculated);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || (inches < 0 || inches >= 12)){
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches/12;
            double remainingInches = (int)inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        else {
            return -1;
        }
    }
}
