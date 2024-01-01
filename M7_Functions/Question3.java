package M7_Functions;

public class Question3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(1253521));
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;

        while(temp > 0) {
            rev = (rev*10) + (temp%10);
            temp /= 10;
        }

        return (rev == num);
    }
}
