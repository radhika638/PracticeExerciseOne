public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(9));
        System.out.println(area(12,26));
    }
    private static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    private static double area(double x, double y){
        if(x<0 || y<0){
            return -1.0;
        }
        return x * y;
    }
}
