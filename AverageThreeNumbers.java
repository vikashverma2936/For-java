import java.util.Scanner;

public class AverageThreeNumbers {

    static double avg(int a, int b, int c) {
        // Fixed: Use 3.0 to ensure double division
        double avg = (a + b + c) / 3.0;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double result = avg(a, b, c);
        System.out.println(result);
        sc.close();
    }
}

