public class Diagonal {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3,
                },
                {
                        4, 5, 6
                },
                {
                        7, 8, 9
                }
        };
        int result = diagonalCalculation(mat);
        System.out.println(result);

    }

    static int diagonalCalculation(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (row == col) {
                    sum += mat[row][col];
                } else if (row + col == n - 1) {
                    sum += mat[row][col];
                }
            }

        }
        return sum;
    }
}






