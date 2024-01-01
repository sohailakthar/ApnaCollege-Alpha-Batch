package M3_Operators;

public class Question1 {
    public static void main(String[] args) {
        int x = 2, y = 5;

        int exp1 = (x * y / x);     // 5
        int exp2 = (x * (y / x));   // 4

        System.out.println(exp1 + "\t" + exp2);
    }
}
