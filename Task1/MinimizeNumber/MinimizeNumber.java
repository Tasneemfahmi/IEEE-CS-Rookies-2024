import java.util.Scanner;

public class MinimizeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        int[] op = new int [N];
        boolean isOdd = false;
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
            if ((A[i]%2)!=0){
                isOdd = true;
            } else {
                while ((A[i]%2)==0){
                    A[i]=A[i]/2;
                    op[i]++;
                }
            }
        }
        int operationsNum = 0;
        if (isOdd) {
            System.out.println(operationsNum);
        } else {
            for (int i = 0; i < N; i++) {
                if (i == 0 || op[i] < operationsNum) {
                    operationsNum = op[i];
                }
            }
            System.out.println(operationsNum);
        }
    }
}