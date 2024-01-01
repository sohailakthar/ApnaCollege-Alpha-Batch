package M4_ConditionalStatements;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");

        int year = sc.nextInt();
        boolean isLeap;

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                isLeap = (year % 400 == 0);
            } else
                isLeap = true;
        } else
            isLeap = false;

        System.out.println("is Leap Year? - " + isLeap);
    }
}
