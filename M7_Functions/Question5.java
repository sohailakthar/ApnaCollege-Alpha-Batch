package M7_Functions;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(4246));      // 16
        System.out.println(sumOfDigits(75741));     // 24
        System.out.println(sumOfDigits(47371));     //22
        System.out.println(sumOfDigits(14657));     //23
        System.out.println(sumOfDigits(74524));     //22
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        while(num > 0) {
            sum += num%10;
            num /= 10;
        }

        return sum;
    }
}
