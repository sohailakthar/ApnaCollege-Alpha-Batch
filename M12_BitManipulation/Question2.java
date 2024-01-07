package M12_BitManipulation;

public class Question2 {
    public static void main(String[] args) {
        int a = 3, b = 5;   // a=011 b=101

        System.out.println("a: "+a+"\tb: "+b);

        a ^= b;     // a=110 b=101
        b ^= a;     // a=110 b=011
        a ^= b;     // a=101 b=011

        System.out.println("a: "+a+"\tb: "+b);
    }
}
