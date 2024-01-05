package M12_BitManipulation;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isEven(3));
        System.out.println(isEven(6));
    }

    private static boolean isEven(int n) {
        if((n&1) == 1)
            return false;
        return true;
    }
}
