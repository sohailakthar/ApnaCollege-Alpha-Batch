package M3_Operators;

public class Question5 {
    public static void main(String[] args) {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);       // 20
        System.out.println(exp2);       // 20
    }
}
