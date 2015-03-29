public class One7Test {
    public static void main(String[] args) {
        int[][] ints = {
                {0, 2, 0},
                {1, 0, 1},
                {1, 2, 3},
                {1, 1, 1},
        };
        One7SetZero.setZero(ints);
        print(ints);
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
