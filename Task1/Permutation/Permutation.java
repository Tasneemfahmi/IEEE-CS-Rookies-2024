import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N= input.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0;i<N;i++) {
            A[i]=input.nextInt();
        }
        for (int i=0;i<N;i++) {
            B[i]=input.nextInt();
        }
        int index=0;
        int[] array = new int[N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++){
                if (A[i]==B[j]){
                    array[index]=B[j];
                    index++;
                    break;
                }
            }
        }
        boolean isequal = true;
        for (int i = 0; i<N; i++){
            if (array[i]!=A[i]){
                isequal=false;
                break;
            }
        }
        if (isequal) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
