import java.util.ArrayList;
import java.util.Scanner;

public class GCDandLCM {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        System.out.println(calculateGCD(A,B)+" "+calculateLCM(A,B));
    }
    private static int calculateGCD(int A, int B) {
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    private static int calculateLCM(int A, int B) {
        return (A * B) / calculateGCD(A, B);
    }
}