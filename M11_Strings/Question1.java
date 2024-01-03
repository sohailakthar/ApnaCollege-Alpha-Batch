package M11_Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// Count frequency of lowercase vowels
public class Question1 {
    public static void main(String[] args) {
        int count = 0;

        Scanner sc = new Scanner(System.in);

        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        for(char c : input.toCharArray()) {
            if(vowels.contains(c))
                count++;
        }

        System.out.println("Your input contains a total of " + count + " lowercase vowels.");
    }
}
