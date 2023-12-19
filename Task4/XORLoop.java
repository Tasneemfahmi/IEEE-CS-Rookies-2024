import java.util.Scanner;

public class XORLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int Q = input.nextInt();
        System.out.println(calculateF(A, B, Q));
    }

    public static int calculateF(int A, int B, int Q) {
        int F = B ^ A;
        if (Q == 1) {
            F = A;
        } else if (Q == 2) {
            F = B;
        } else {
            int prevQ = B;
            int prevPrevQ = A;
            for (int i = 3; i <= Q; i++) {
                F = prevQ ^ prevPrevQ;
                prevPrevQ = prevQ;
                prevQ = F;
            }
        }
        return F;
    }
}
