import java.util.Scanner;

public class SwapMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();
        int Y = input.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        swapColumns(X - 1, Y - 1, N, matrix);
        swapRows(X - 1, Y - 1, N, matrix);
        printMatrix(matrix, N);

    }

    public static void swapColumns(int X, int Y, int N, int[][] matrix) {
        for (int i = 0; i < N; i++) {
            int temp1 = matrix[X][i];
            matrix[X][i] = matrix[Y][i];
            matrix[Y][i] = temp1;

            for (int j = 0; j < N; j++) {

                int temp2 = matrix[i][X];
                matrix[i][X] = matrix[i][Y];
                matrix[i][Y] = temp2;

            }
        }
    }

    public static void swapRows(int X, int Y, int N, int[][] matrix) {
        for (int i = 0; i < N; i++) {
            int temp1 = matrix[i][X];
            matrix[i][X] = matrix[i][Y];
            matrix[i][Y] = temp1;
            for (int j = 0; j < N; j++) {

                int temp2 = matrix[X][i];
                matrix[X][i] = matrix[Y][i];
                matrix[Y][i] = temp2;

            }
        }
    }

    public static void printMatrix(int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}