package M3_Operators;

public class Question3 {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;

        x += y;         // x = 4
        y -= z;         // y = 0
        z /= (x + y);   // z = 0

        System.out.println(x + " " + y + " " + z);
    }
}
