import java.util.Scanner;

public class XORRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int Q = input.nextInt();
        System.out.println(calculateF(A,B,Q));
    }
    public static int calculateF (int A,int B,int Q) {
        int F;
        if (Q == 1) {
            F = A;
        } else if (Q == 2) {
            F = B;
        } else {
            F = (calculateF(A,B,Q-1))^(calculateF(A,B,Q-2));
        }
        return F;
    }
}
