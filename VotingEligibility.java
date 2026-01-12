import java.util.Scanner;

public class VotingEligibility {
    static int votingEligibility(int age) {
        if (age >= 18) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();

        int result = votingEligibility(age);
        if (result == 1) {
            System.out.println("You are Eligible");
        } else {
            System.out.println("You are not Eligible");
        }
    }
}
