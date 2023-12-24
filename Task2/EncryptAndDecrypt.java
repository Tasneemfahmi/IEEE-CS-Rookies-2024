import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        String key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";
        String original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Scanner input = new Scanner(System.in);
        int Q = input.nextInt();
        String S = input.next();
        String output="";
        if (Q==1){
            for(int i=0;i<S.length();i++){
                for(int x=0;x<original.length();x++){
                    if(S.charAt(i)==original.charAt(x)){
                        output = output+key.charAt(x);
                    }
                }
            }
        } else {
            for(int i=0;i<S.length();i++){
                for(int y=0;y<key.length();y++){
                    if(S.charAt(i)==key.charAt(y)){
                        output = output+original.charAt(y);
                    }
                }
            }
        }
        System.out.println(output);
    }
}
