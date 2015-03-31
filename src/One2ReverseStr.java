public class One2ReverseStr {
    public static String reverseStr(String str) {
        /*
        two references, one at the beginning, the other at the end, work towards the center.
         */
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char foo = chars[i];
            chars[i] = chars[j];
            chars[j] = foo;
        }
        return new String(chars);
    }
}
