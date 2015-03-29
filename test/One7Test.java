public class One7Test {
    public static void main(String[] args) {
        int[][] ints = {
                {9, 2, 0},
                {1, 0, 1},
                {1, 2, 3},
                {1, 1, 1},
        };
        int[][] ints2 = {
                {1,0},
                {1,0}
        };

        test(ints, ints2);
    }

    private static void test(int[][]... foo) {
        for (int[][] bar : foo) {
            print(bar);
            System.out.println("|");
            System.out.println("V");
            One7SetZero.setZero(bar);
            print(bar);
            System.out.println("----------------------------------------");
        }
    }

    private static void print(int[][] ints) {
        for (int[] b : ints) {
            for (int c : b) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
