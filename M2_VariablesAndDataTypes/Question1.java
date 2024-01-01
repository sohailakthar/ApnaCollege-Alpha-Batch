package M2_VariablesAndDataTypes;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a+b+c)/3;

        System.out.println("Average is: " + avg);

        sc.close();
    }
}
