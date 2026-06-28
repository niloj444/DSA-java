import java.util.Arrays;
public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = transpose(matrix);

        System.out.println("Using deepToString:");
        System.out.println(Arrays.deepToString(result));

        System.out.println("\nRow by row:");

        for (int row = 0; row < result.length; row++) {
            System.out.println(Arrays.toString(result[row]));
        }
    }
    static int[][] transpose(int[][] matrix) {

        int[][] matrix1 = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix1[col][row] = matrix[row][col];
            }
        }

        return matrix1;
    }

}
