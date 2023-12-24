import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxSubsequence {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String S = input.next();
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i =0; i<N;i++){
            for(int j=i+1;j<=N;j++){
                arrayList.add((String) S.subSequence(i,j));
            }
        }
//        System.out.println(arrayList.toString());
        Collections.sort(arrayList);
//        System.out.println(arrayList.toString());
        ArrayList<String> newArrayList = new ArrayList<String>();
        boolean isWrong = false;
        for(int i=0;i<arrayList.size();i++){
            String item = arrayList.get(i);
            for (int j=1;j<item.length();j++){
                char letter = item.charAt(j);
                char prevLetter = item.charAt(j-1);
                if (letter==prevLetter){
                    isWrong =true;
                } else {
                    isWrong =false;
                }
                if(isWrong){
                    if (!newArrayList.contains(arrayList.get(i)))
                        newArrayList.add(arrayList.get(i));
                }
            }
        }
        ArrayList<String> finalArrayList = new ArrayList<String>();
        for (int i=0;i<arrayList.size();i++){
            if(!newArrayList.contains(arrayList.get(i))){
                finalArrayList.add(arrayList.get(i));
            }
        }
        int maximum = 1;
        for(int i =0; i<finalArrayList.size();i++){
            if (finalArrayList.get(i).length()>=maximum){
                maximum = finalArrayList.get(i).length();
            }
        }
//        System.out.println(arrayList.toString());
//        System.out.println(newArrayList.toString());
//        System.out.println(finalArrayList.toString());
        System.out.println(maximum);
    }
}
