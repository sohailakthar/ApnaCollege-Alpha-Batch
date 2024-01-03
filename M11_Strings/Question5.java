package M11_Strings;

// intern() - https://www.javatpoint.com/java-string-intern
public class Question5 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);           // false - because stored separately in Heap (created using 'new')

        str1 = "World";
        str2 = "World";
        System.out.println(str1 == str2);           // true - because stored in String Constant Pool

        String str3 = new String("World").intern();
        String str4 = str2.intern();
        System.out.println(str3 == str4);           // true - intern() caused str3 & str4 to point to existing reference of same word
        System.out.println(str1 == str3);           // true - intern() caused str3 & str4 to point to existing reference of same word
    }
}
