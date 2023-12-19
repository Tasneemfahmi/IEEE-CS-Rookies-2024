import java.util.Scanner;

public class MultiplicationOfMatrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowsA = input.nextInt();
        int columnsA = input.nextInt();
        int[][] A = new int[rowsA][columnsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                A[i][j] = input.nextInt();
            }
        }
        int rowsB = input.nextInt();
        int columnsB = input.nextInt();
        int[][] B = new int[rowsB][columnsB];
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                B[i][j] = input.nextInt();
            }
        }
        int[][] result = multiplyMatrices(A, B);

        printMatrix(result);
    }
    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int columnsA = A[0].length;
        int rowsB = B.length;
        int columnsB = B[0].length;

        int[][] C = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < columnsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
