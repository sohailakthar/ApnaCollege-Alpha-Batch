package M4_ConditionalStatements;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int input = sc.nextInt();

        if(input < 0)
            System.out.println("Negative");
        else
            System.out.println("Positive");

    }
}
