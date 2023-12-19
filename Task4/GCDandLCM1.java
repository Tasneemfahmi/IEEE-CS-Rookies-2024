import java.util.ArrayList;
import java.util.Scanner;

public class GCDandLCM {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        System.out.println(calculateGCD(A,B)+" "+calculateLCM(A,B));
    }
    public static int calculateGCD(int A, int B){
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int GCD = 1;
        for (int i = 1; i <= A; i++) {
            if(A%i==0){
                array1.add(i);
            }
        }
        for (int i = 1; i <= B; i++) {
            if(B%i==0){
                array2.add(i);
            }
        }
        if (A>=B){
            for (int i =array1.size()-1; i >= 0; i--) {
                if(array2.contains(array1.get(i))){
                    GCD=array1.get(i);
                    return GCD;
                }
            }
        } else {
            for (int i = array2.size()-1; i >= 0; i--) {
                if(array1.contains(array2.get(i))){
                    GCD=array2.get(i);
                    return GCD;
                }
            }
        }
        return GCD;
    }
    public static int calculateLCM(int A, int B){
        int M1 = A;
        int M2 = B;
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int i=1;
        while (true){
            M1=A*i;
            array1.add(M1);
            M2=B*i;
            array2.add(M2);
            if (array1.contains(M2)){
                return M2;
            } else if (array2.contains(M1)) {
                return M1;
            }
            i++;
        }
    }
}