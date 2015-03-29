public class One6Test {
    public static void main(String[] args) {
        testMatrix(generate(1), generate(2), generate(3), generate(12));
    }

    private static void testMatrix(byte[][]... matrix) {
        for (byte[][] b : matrix) {
            print(b);
            System.out.println("|");
            System.out.println("V");
            One6RotateImg.inPlaceRotate(b);
            print(b);
            System.out.println("-----------------------------");
        }
    }

    private static byte[][] generate(int n) {
        byte[][] matrix = new byte[n][n];

        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < n; j++) {
                matrix[i][j] = (byte) (i * n + j + 1);
            }
        }
        return matrix;
    }

    private static void print(byte[][] a) {
        for (byte[] b : a) {
            for (byte c : b) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
