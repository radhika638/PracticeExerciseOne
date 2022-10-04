public class MinutesToYearsAndDay {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes/(60*24*365);
        long remainingMinutes = minutes % (60*24*365);
        long days = remainingMinutes/(60*24);

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
