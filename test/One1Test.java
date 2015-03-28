public class One1Test {
    public static void main(String[] args) {
        test("Unique wr˜˚∆¨ˆ\"09876œ∑ßåΩ",
                "NotUni que˜",
                "Unique wr˜˚∆¨ˆ\"09876œ∑ßåΩ",
                "NotUnique˜˜",
                "  ",
                "");
    }

    public static void test(String... strs) {
        for (String str : strs) {
            One1UniqueChar.additionalSpace(str);
            One1UniqueChar.noAddiSpace(str);
        }
    }
}
