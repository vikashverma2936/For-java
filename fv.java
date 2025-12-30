import java.util.Scanner;

public class fv {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter Second number (b): ");
        int b = sc.nextInt(); 

        if(a == b) {
            System.out.print("Equal");
        }else if (a > b) {
            System.out.print("A is Greater");
        }else if (a < b) {
            System.out.print("A is lesser");
        }
    }
}
