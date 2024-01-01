package M7_Functions;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(isEven(2352));
        System.out.println(isEven(574543));
        System.out.println(isEven(5435));
        System.out.println(isEven(6346));
    }

    public static boolean isEven(int a) {
        return ((a & 1) != 1);
    }
}
