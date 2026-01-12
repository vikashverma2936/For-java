import java.util.Scanner;

public class GreetingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button (1, 2, 3):");
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

