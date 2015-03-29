public class One6RotateImg {
    // change byte[][] to byte[][][4] will be the original question
    public static void inPlaceRotate(byte[][] matrix) {
        if (matrix[0].length != matrix.length) {
            throw new IllegalArgumentException("Not a Square matrix");
        }
        rotateLayer(matrix, matrix.length - 1);
    }

    private static void rotateLayer(byte[][] matrix, int layerIndex) {
        if (layerIndex >= matrix.length / 2) {
            int layer = matrix.length - layerIndex - 1;
            for (int i = 0; i < matrix.length - 2 * layer - 1; i++) {
                exch(matrix, layer + i, layer);
            }
            rotateLayer(matrix, layerIndex - 1);
        }
    }

    private static void exch(byte[][] matrix, int x1, int y1) {
        int n = matrix.length - 1;
        byte foo = matrix[y1][n - x1];
        matrix[y1][n - x1] = matrix[x1][y1];
        matrix[x1][y1] = matrix[n - y1][x1];
        matrix[n - y1][x1] = matrix[n - x1][n - y1];
        matrix[n - x1][n - y1] = foo;
    }
}
