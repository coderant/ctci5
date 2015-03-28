import java.lang.String;import java.lang.System;import java.util.Arrays;

public class One3StrPermu {
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

    public static boolean detectPermuSweep(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            int[] count = new int[256]; //ASCII
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

    public static void main(String[] args) {
        String str1 = "0123456789";
        String str2 = "0123456789";
        System.out.println(detectPermuSweep(str1,str2));
    }
}
