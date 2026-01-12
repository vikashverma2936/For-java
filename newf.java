import java.util.Scanner;

public class NewF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bytecode has no prompt "Enter button", simply reads.
        // But for UX I will add it?
        // Logic:
        // 12: nextInt
        // Tableswitch 1..3

        System.out.println("Enter button (1-3):");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hola");
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}
