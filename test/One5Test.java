public class One5Test {
    public static void main(String[] args) {
        String[] str = {"12345677", "aabbccdd", "aaabbbcccddddddd", "dddddd", "   "};
        test(str);
    }

    private static void test(String... str) {
        for (String s : str) {
            System.out.print(s + " --> ");
            System.out.println(One5StrZip.strZip(s));
        }
    }
}
