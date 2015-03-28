import java.lang.String;import java.lang.StringBuilder;import java.lang.System;public class One5StrZip {
    public static String strZip(String str) {
        StringBuilder newStr = new StringBuilder();
        char[] chars = str.toCharArray();

        int srt = 0;
        newStr.append(chars[srt]);
        int count = 0;
        for (int end = 0; end <= chars.length;) {
            if (end == chars.length) {
                if (count > 1) {
                    newStr.append(count);
                }
                break;
            } else if (chars[srt] != chars[end]) {
                if (count > 1) {
                    newStr.append(count);
                }
                newStr.append(chars[end]);
                srt = end;
                count = 0;
            } else {
                end++;
                count++;
            }
        }
        if (newStr.length() >= str.length()) {
            return str;
        } else {
            return newStr.toString();
        }

    }
}
