public class One2ReverseStr {
    public static String reverseStr(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char foo = chars[i];
            chars[i] = chars[j];
            chars[j] = foo;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("12345678"));
    }
}
