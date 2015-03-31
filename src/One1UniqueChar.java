import java.util.Arrays;

public class One1UniqueChar {
    public static void additionalSpace(String str) {

        /* assign a boolean for each possible char */
        boolean[] existed = new boolean['\uFFFF'];
        for (char c : str.toCharArray()) {
            if (existed[c]) {
                /*
                if c has existed, then this str is not unique
                return without continuing
                */
                System.out.println("\"" + str + "\"" + " is not unique");
                return;
            } else {
                //set c as existed
                existed[c] = true;
            }
        }
        //after one run, func has not returned, then this str is unique
        System.out.println("\"" + str + "\"" + " is Unique String!!");
    }

    public static void noAddiSpace(String str) {
        /*
        Sort then only check neighboring chars
         */
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