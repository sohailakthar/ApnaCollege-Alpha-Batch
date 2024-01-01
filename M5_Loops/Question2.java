package M5_Loops;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int oddSum, evenSum;
        oddSum = evenSum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter n numbers: ");
        while(n-- > 0) {
            int input = sc.nextInt();

            if((input & 1) == 1)
                oddSum += input;
            else
                evenSum += input;
        }

        System.out.println("Odd Sum: " + oddSum);
        System.out.println("Even Sum: " + evenSum);

    }
}
