import java.util.Arrays;

public class One1UniqueChar {
    public static void additionalSpace(String str) {
        boolean[] existed = new boolean['\uFFFF'];
        for (char c : str.toCharArray()) {
            if (existed[c]) {
                System.out.println("\"" + str + "\"" + " is not unique");
                return;
            } else {
                existed[c] = true;
            }
        }
        System.out.println("\"" + str + "\"" + " is Unique String!!");
    }

    public static void noAddiSpace(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                System.out.println("\"" + str + "\"" + " is not unique");
                return;
            }
        }
        System.out.println("\"" + str + "\"" + " is Unique String!!");
    }
}