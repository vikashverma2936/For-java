import java.util.Scanner;

public class CircumferenceCircle {
    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius :");
        double radius = sc.nextDouble();
        double result = circumference(radius);
        System.out.println("Circumference of circle is :" + result);
        sc.close();
    }

}
