public class One2Test {
    public static void main(String[] args) {
        test("123<>?∆∆˙∆˚˙˚∆˙",
                "012345678",
                "",
                "23          1");
    }

    private static void test(String... strs) {
        for (String str : strs) {
            System.out.println(One2ReverseStr.reverseStr(str));
        }
    }
}
