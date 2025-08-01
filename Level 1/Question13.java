import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println(sum == formulaSum ? "Both results match." : "Results do not match.");
    }
}
