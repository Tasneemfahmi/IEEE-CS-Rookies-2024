import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] tArray = new int[T];
        for (int i = 0; i < T; i++) {
            tArray[i] = input.nextInt();
            int[] arrayOne = new int[tArray[i]];
            for (int j = 0; j < arrayOne.length; j++) {
                arrayOne[j] = input.nextInt();
            }
            for (int j = 0; j < arrayOne.length; j++) {
                int max = arrayOne[j];

                for (int k = j; k < arrayOne.length; k++) {
                    max = Math.max(max, arrayOne[k]);
                    System.out.print(max + " ");
                }
            }
            System.out.println();
        }
    }
}
