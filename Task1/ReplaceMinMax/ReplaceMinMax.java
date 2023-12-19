import java.util.Scanner;

public class ReplaceMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        int max = 0;
        int min = 0;
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
            if (i == 0) {
                max = i;
                min = i;
            } else {
                if (A[i] > A[max]) {
                    max = i;
                } else if (A[i] < A[min]) {
                    min = i;
                }
            }
        }
        int temp = A[max];
        A[max] = A[min];
        A[min] = temp;
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A[i]);
            System.out.print(" ");
        }
        System.out.print(A[N - 1]);
    }
}