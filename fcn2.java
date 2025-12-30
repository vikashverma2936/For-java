import java.util.Scanner;

public class fcn2 {

    public static int SumTwo(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = SumTwo(a, b); // store returned value
        System.out.println(result); // print the sum
    }
}
