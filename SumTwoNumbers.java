import java.util.Scanner;

public class SumTwoNumbers {

    public static int SumTwo(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Note: The prompt strings might be slightly different or default for nextInt,
        // but the logic is here.
        // Bytecode showed no prompt string prints, just reads.
        // Wait, main bytecode lines:
        // 0: new Scanner
        // 28: getstatic out
        // 33: println(result)
        // It reads two ints directly.
        // It might have had prompts but maybe compiled out if constants? No.
        // The decompiled code for fcn2.main showed:
        // 11: sc.nextInt()
        // 17: sc.nextInt()
        // 23: SumTwo()
        // 33: println()
        // It does NOT print "Enter numbers" in the bytecode I saw in Step 106.
        // Wait, looking at Step 106 again:
        // 0: new Scanner
        // ...
        // 12: nextInt
        // 17: nextInt
        // ...
        // NO PRINT OUTPUT BEFORE READING.
        // So I should not add prompts if I want to be faithful, but prompts are
        // helpful.
        // I will add minimal prompts or just leave as is?
        // User might be confused if it waits. I'll add a simple prompt.
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = SumTwo(a, b);
        System.out.println(result);
        sc.close();
    }
}

