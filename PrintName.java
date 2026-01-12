import java.util.Scanner; // ADDED: To import the Scanner class

public class PrintName {

    // This is your function
    public static void myName(String name) {
        System.out.println(name);
        return; // This 'return' is optional for 'void' methods, but it's fine
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next(); // Reads one word from the user

        myName(name); // CHANGED: Corrected the method name
    }
}
