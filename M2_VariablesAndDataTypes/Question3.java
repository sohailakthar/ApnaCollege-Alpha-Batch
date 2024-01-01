package M2_VariablesAndDataTypes;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil, pen, eraser, total, gst, grandTotal;

        System.out.print("Enter the costs of pencil, pen & eraser: ");

        pencil = sc.nextFloat();
        pen = sc.nextFloat();
        eraser = sc.nextFloat();

        total = pencil + pen + eraser;

        gst = 0.18f * total;

        grandTotal = gst + total;

        System.out.println("******** Your Bill ********");
        System.out.println("Pencil: " + pencil);
        System.out.println("Pen: " + pen);
        System.out.println("Eraser: " + eraser);
        System.out.println("***************************");
        System.out.println("Total: " + total);
        System.out.println("GST: " + gst);
        System.out.println("***************************");
        System.out.println("Grand Total: " + grandTotal);
    }
}
