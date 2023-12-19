import java.util.Scanner;

public class CheckCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int N = A + B + 1;
        String S = input.next();
        String[] array = new String[2];
        if (S.contains("-")) {
            array = S.split("-");
            if (array[0].length()==A && array[1].length()==B){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
