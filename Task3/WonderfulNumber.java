import java.util.Scanner;
import java.util.function.BinaryOperator;

public class WonderfulNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        if (N % 2 != 0) {
            if(isBinPalindrome(N)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isBinPalindrome (int N){
        int length = (int) Math.ceil((Math.log(N))/Math.log(2));
        int[] array1 = new int[length];
        String bin1 = "";
        String bin2 = "";
        for (int i = 0; i < length; i++) {
            array1[i] = N/2;
            bin1 = N%2+bin1 ;
            bin2 = bin2+N%2 ;
            N= array1[i];
        }
        if (bin1.equals(bin2)){
            return true;
        } else {
            return false;
        }
    }
}