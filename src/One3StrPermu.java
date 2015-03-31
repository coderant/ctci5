import java.util.Arrays;

public class One3StrPermu {
    /*
    Sort two strs, if they are permutations, they should be the same after
     */
    public static boolean detectPermuSort(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            return Arrays.equals(chars1, chars2);
        }
    }

    /*
    count char
    if two strs are permutations, they should have the same char counts
     */
    public static boolean detectPermuSweep(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            /*
            assume ASCII.
            One count array.
             */
            int[] count = new int[256];
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }
            for (int i : count) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
