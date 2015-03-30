public class One8Rotation {
    private static boolean isSubString(String sub, String target) {
        if (sub.length() == 0 && target.length() == 0) {
            return true;
        } else if (sub.length() <= target.length()) {
            char[] subChar = sub.toCharArray();
            char[] targetChar = target.toCharArray();

            OUTER:
            for (int i = 0; i <= targetChar.length - subChar.length; i++) {
                for (int shift = 0; shift < subChar.length; shift++) {
                    if (targetChar[i + shift] != subChar[shift]) {
                        continue OUTER;
                    }
                }
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public static boolean isRotate(String str1, String str2) {
        return str1.length() == str2.length() && isSubString(str1, str2 + str2);
    }
}
