import helper.LinkedList;

public class Two1Test {
    public static void main(String[] args) {
        test(1, "abcabccccccc", "ABC", "1111111111222", "2");
        test(2, "abcabccccccc", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1111111111222", "2");
    }

    private static LinkedList<Character> makeList(String str) {
        Character[] c = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        return new LinkedList<Character>(c);
    }

    private static void test(int way, String... strs) {
        if (way == 1) {
            for (String str : strs) {
                System.out.print(makeList(str));
                System.out.print(" --> ");
                System.out.println(Two1RemoveDup.removeDupHash(makeList(str)));
            }
        } else if (way == 2) {
            for (String str : strs) {
                System.out.print(makeList(str));
                System.out.print(" --> ");
                System.out.println(Two1RemoveDup.removeDupNoBuffer(makeList(str)));
            }
        }
    }
}
