public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking){
            if ((hourOfDay < 8 && hourOfDay >= 0)|| (hourOfDay > 22 && hourOfDay <= 24)) {
                return true;
            }
            else if(hourOfDay < 0) {
                return false;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }
}
