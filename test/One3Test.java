public class One3Test {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        StringBuilder str = new StringBuilder();
        for (int i = 10; i > 0; i--) {
            for (int j = 15; j > 0; j--) {
                str.append(StdRandom.uniform(2000));
            }
            test(str.toString());
            str.delete(0, str.length());
        }
    }

    private static void test(String str) {
        System.out.println(One3StrPermu.detectPermuSort(str, str + "1"));
        System.out.println(One3StrPermu.detectPermuSweep(str, str + "2"));
        System.out.println(One3StrPermu.detectPermuSort(str, str));
        System.out.println(One3StrPermu.detectPermuSweep(str, str));
    }
}
