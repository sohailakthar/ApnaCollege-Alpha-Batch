package M11_Strings;

// Check if two strings are anagrams
public class Question4 {
    public static void main(String[] args) {
        System.out.println(isAnagram("racecar", "carrace"));                // true
        System.out.println(isAnagram("agentleman", "elegantman"));          // true
        System.out.println(isAnagram("hippopotamus", "hipspotsandsum"));    // false
        System.out.println(isAnagram("heytherebuddy", "buddytherehoy"));    // false
        System.out.println(isAnagram("theeyes", "theysee"));                // true
    }

    private static boolean isAnagram(String str1, String str2) {
        int len = str1.length();

        if(len != str2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i=0; i<len; i++) {
            count1[str1.charAt(i)-'a']++;
            count2[str2.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++) {
            if(count1[i] != count2[i])
                return false;
        }

        return true;
    }
}
