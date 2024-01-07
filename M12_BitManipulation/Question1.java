package M12_BitManipulation;

public class Question1 {
    public static void main(String[] args) {
        // x ^ x  always results in 0
        for(int i=1; i<=10; i++)
            System.out.println(nXorN(i));
    }

    private static int nXorN(int n) {
        return n^n;     // n^n is equivalent to 0
    }
}
