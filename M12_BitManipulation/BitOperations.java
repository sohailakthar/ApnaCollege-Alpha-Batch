package M12_BitManipulation;

public class BitOperations {
    public static void main(String[] args) {
        get_ith_bit(9, 3);
        set_ith_bit(9, 2);
        clear_ith_bit(10, 1);
        update_ith_bit(9, 0, 0);
        update_ith_bit(9, 2, 1);
        clear_last_i_bits(15, 2);
        clear_range_of_bits(2515, 2, 7);
        isPowerOf2(16);
        isPowerOf2(7);
    }

    private static void get_ith_bit(int n, int i) {
        /*
        int bitmask = (1 << i);
        if(n & bitmask == 0)
            return 0;
        else
            return 1;
         */
        int ithBit = ((n & (1 << i)) == 0) ? 0 : 1;
        System.out.println(i + "th bit of " + Integer.toBinaryString(n) + " is: " + ithBit);
    }

    private static void set_ith_bit(int n, int i) {
        int after = n | (1 << i);
        System.out.println("After setting " + i + "th bit of " + Integer.toBinaryString(n) + ": " + after + "(" + Integer.toBinaryString(after) + ").");
    }

    private static void clear_ith_bit(int n, int i) {
        int after = n & ~(1 << i);
        System.out.println("After clearing " + i + "th bit of " + Integer.toBinaryString(n) + ": " + after + "(" + Integer.toBinaryString(after) + ").");
    }

    private static void update_ith_bit(int n, int i, int val) {
        int temp = (n & ~(1 << i));
        int after = temp | (val << i);
        System.out.println("After updating " + i + "th bit of " + Integer.toBinaryString(n) + " to " + val + ": " + after + "(" + Integer.toBinaryString(after) + ").");
    }

    // ~0 represents -1 ie 1111....111 (all ones).
    private static void clear_last_i_bits(int n, int i) {
        int after = n & (~0 << i);
        System.out.println("After clearing last " + i + " bits of " + Integer.toBinaryString(n) + ": " + after + "(" + Integer.toBinaryString(after) + ").");
    }

    private static void clear_range_of_bits(int n, int i, int j) {
        int a = ~0 << (j+1);
        int b = ~(~0 << i);     // or (1 << i)-1
        int bitmask = a | b;
        int after = n & bitmask;
        System.out.printf("After clearing bits in range %d, %d of %d (%s): %d (%s)", i, j, n, Integer.toBinaryString(n), after, Integer.toBinaryString(after));
    }

    private static void isPowerOf2(int n) {
        System.out.printf("\nIs %d power of 2 - %b", n, (n & n-1) == 0);
    }
}
