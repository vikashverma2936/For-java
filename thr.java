import java.util.*;

public class thr {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter Second number (b): ");
        int b = sc.nextInt();

        int ans = (a * b) / (a-b);
        System.out.println(ans);
    }
}