package M12_BitManipulation;

public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(fastExpo(8, 10));
        System.out.println(fastExpo(7, 14));
        System.out.println(fastExpo(9, 8));
    }

    private static long fastExpo(int a, int n) {
        long ans = 1;

        while(n > 0) {
            if((n&1) == 1) {
                ans *= a;
            }
            a *= a;
            n >>= 1;
        }

        return ans;
    }
}
