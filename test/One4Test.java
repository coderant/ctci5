public class One4Test {
    public static void main(String[] args) {
        String[] strs = {" 1 2 3 4 5            ",
                "  1 2 3 4 5         ",
                "1  ",
                ""};
        test(strs);
    }

    private static void test(String... str) {
        for (String s : str) {
            System.out.print(s + " to : ");
            System.out.println(One4SpaceSwap.spaceSwap(s.toCharArray()));
        }
    }
}
