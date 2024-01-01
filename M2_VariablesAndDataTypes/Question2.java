package M2_VariablesAndDataTypes;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side: ");

        int side = sc.nextInt();

        int area = side*side;

        System.out.println("Area: " + area);
    }
}
