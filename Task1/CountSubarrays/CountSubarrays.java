import java.util.Scanner;

public class CountSubarrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] tArray = new int[T];
        int[] sum = new int[T];
        for (int i = 0; i < T; i++) {
            tArray[i] = input.nextInt();
            int[] arrayOne = new int[tArray[i]];
            for (int j = 0; j < arrayOne.length; j++) {
                arrayOne[j] = input.nextInt();
            }
            sum[i]=arrayOne.length;
            for (int j = 0; j < arrayOne.length; j++) {
                for (int k = j; k < arrayOne.length - 1; k++) {
                    if (arrayOne[k] < arrayOne[k + 1]) {
                        sum[i]++;
                        if (k + 2 < arrayOne.length && arrayOne[k + 1] < arrayOne[k + 2]) {
                            sum[i]++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        for (int j = 0; j < T; j++) {
            System.out.println(sum[j] + " ");
        }
    }
}
