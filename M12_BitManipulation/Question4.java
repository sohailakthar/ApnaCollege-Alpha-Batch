package M12_BitManipulation;

public class Question4 {
    public static void main(String[] args) {
        for(char ch='A'; ch<='Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
    }
}
