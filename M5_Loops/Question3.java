package M5_Loops;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
