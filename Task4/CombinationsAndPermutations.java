import java.util.Scanner;

public class CombinationsAndPermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        System.out.println(calculateNCR(A, B)+ " " + calculateNPR(A, B));
    }

    private static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    private static long calculateNCR(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private static long calculateNPR(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
}