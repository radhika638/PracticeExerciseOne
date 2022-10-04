public class Operators {

    public static void main(String[] args){
        int myResult = 1 + 2;
        System.out.println("1 + 2 = " + myResult);
        int previousResult = myResult;
        System.out.println("previous result = " + previousResult);
        myResult = myResult - 1;
        System.out.println("3 - 1 = " + myResult);

        myResult = myResult * 10;
        System.out.println(myResult);
        myResult = myResult/5;
        System.out.println(myResult);
        myResult = myResult % 3;
        System.out.println(myResult);

        myResult = myResult + 1;
        //myResult++;
        System.out.println(myResult);

        myResult--;
        System.out.println(myResult);

        myResult += 2;
        System.out.println(myResult);
        myResult *= 10;
        System.out.println(myResult);

        myResult /= 3;
        System.out.println(myResult);

        myResult -= 2;
        System.out.println(myResult);
    }
}
