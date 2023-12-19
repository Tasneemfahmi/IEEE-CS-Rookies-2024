import java.util.Scanner;

public class SmallestPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int k = 0; k < T; k++) {
            int N = input.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = input.nextInt();
            }
            int length =0;
            for(int i=1;i<N;i++){
                length+=i;
            }
            int[] sum = new int[length];
            int index = 0;
            for (int i = 1; i < N; i++) {
                for (int j = i+1; j <= N; j++) {
                    sum[index] = A[i-1] + A[j-1] + j - i;
                    index++;
                }
            }
            int min = sum[0];
            for (int i = 0; i < sum.length; i++) {
                if (sum[i] <= min) {
                    min = sum[i];
                }
            }
            System.out.println(min);
        }
    }
}
