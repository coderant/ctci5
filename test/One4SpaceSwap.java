public class One4SpaceSwap {
    public static char[] spaceSwap(char[] chars) {
        //scan for tailing stub whitespaces
        int stubCount = 0;
        int lastCharIndex = chars.length;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                lastCharIndex = i;
                break;
            } else {
                stubCount++;
            }
        }

        //chars is all spaces
        if (stubCount == chars.length) {
            return chars;
        }

        //count spaces
        int spaceCount = 0;
        for (int i = 0; i <= lastCharIndex; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }

        if (spaceCount == 0) {
            return chars;
        } else if (spaceCount * 2 + lastCharIndex > chars.length - 1) {
            throw new IllegalArgumentException("Chars length is too short");
        }

        //add %20
        for (int i = lastCharIndex; i >= 0 && spaceCount > 0; i--) {
            if (chars[i] == ' ') {
                spaceCount--;
                chars[i + 2 * spaceCount] = '%';
                chars[i + 1 + 2 * spaceCount] = '2';
                chars[i + 2 + 2 * spaceCount] = '0';
            } else {
                chars[i + 2 * spaceCount] = chars[i];
            }
        }
        return chars;
    }

    public static void main(String[] args) {
        String str = "   1   3as d f  ˙˙©˙ßå ßß                         ";
        System.out.println(spaceSwap(str.toCharArray()));
    }

}
