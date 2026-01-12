import java.util.Scanner;

public class ComplexCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter Second number (b): ");
        int b = sc.nextInt();

        // Logic from bytecode: (a * b) / (a - b)
        // 39: imul
        // 42: isub
        // 43: idiv
        if (a - b == 0) {
            System.out.println("Division by zero error (a == b)");
        } else {
            int result = (a * b) / (a - b);
            System.out.println(result);
        }
        sc.close();
    }
}

