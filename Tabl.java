import java.util.Scanner; // ← You forgot this line

public class Tabl {
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     for (int i = 1; i <= 10; i++) { // start from 1 (not 0)
    //         System.out.println(n + " x " + i + " = " + (n * i));
    //     }

    //     sc.close(); // optional but good practice
    int n = 4;

    for(int i = 1; i <= n; i--){
        for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
    }
    }
}
