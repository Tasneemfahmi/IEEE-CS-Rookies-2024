import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        String H = "hello";
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j <= 5; j++) {
                String sub = (String) H.subSequence(i, j);
                if (sub.length() > 1) {
                    arrayList.add(sub);
                }
            }
        }
        boolean isTrue = false;
        for (int j = 0; j < arrayList.size(); j++) {
            if (S.contains(arrayList.get(j))){
                isTrue =true;
            }
        }
        if(isTrue){
            System.out.println("YES");
        }
    }
}
