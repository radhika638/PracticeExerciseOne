public class SwitchCase {

    public static void main(String[] args) {

        int switchValue = 6;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 and 5");
                break;
            case 6:
                System.out.println("Value was neither 3, 4, or 5");
                break;
            default:
                System.out.println("Value was neither 1 or 2");
                break;
        }

        char charValue = 'A';
        switch (charValue){
            case 'A':
                System.out.println("Found character A");
                break;
            case 'B':
                System.out.println("Found character B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Found character" + charValue);
                break;
            default:
                System.out.println("Did not find any characters");
                break;
        }

        String month = "JANUARY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
