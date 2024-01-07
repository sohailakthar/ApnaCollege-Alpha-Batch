package M12_BitManipulation;

public class Question3 {
    public static void main(String[] args) {
        // ~a results in -(a+1)
        // -~a results in -(-(a+1)) -> a+1

        int a = 5;
        System.out.println(a+" after adding 1: " + (-~a));
        a = -3;
        System.out.println(a+" after adding 1: " + (-~a));
        a = 0;
        System.out.println(a+" after adding 1: " + (-~a));
    }
}
