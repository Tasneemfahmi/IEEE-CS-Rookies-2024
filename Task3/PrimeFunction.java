import java.util.Scanner;

public class PrimeFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int N = input.nextInt();
            if (isPrime(N)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isPrime(int N){
        if (N==2){
            return true;
        } else if (N<=1) {
            return false;
        } else if (N%2==0) {
            return false;
        } else {
            for(int i = 3; i < N; i+=2) {
                if (N%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}