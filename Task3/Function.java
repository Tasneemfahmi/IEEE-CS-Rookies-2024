import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int N = input.nextInt();
        System.out.println(function(X,N));
    }
    public static int function(int X,int N){
        int S = 0;
        for (int i = 2; i <= N; i+=2) {
            S+= (int) Math.pow(X,i);
        }
        return S;
    }
}