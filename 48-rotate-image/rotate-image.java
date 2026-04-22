class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] result = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);

        for (int row = 0; row < len; row++) {
            for (int column = 0; column < len; column++) {
                matrix[column][len - 1 - row] = result[row][column];
            }
        }
    }
}