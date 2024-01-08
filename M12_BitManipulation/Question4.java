package M12_BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
//        for(char ch='A'; ch<='Z'; ch++) {
//            System.out.print((char) (ch | ' '));
//        }

        System.out.println(1^2^2^4);
        System.out.println(1^2^3^4);

        Integer[] arr = new Integer[] {1, 2, 3};
        int n = 3;
        List<Integer> list = Arrays.stream( arr ).sorted().collect( Collectors.toList() );
        System.out.println(list.subList(0, 2));

    }
}
