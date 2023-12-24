import java.util.ArrayList;
import java.util.Scanner;

public class FiveInOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N= input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("The maximum number : " + max(arr));
        System.out.println("The minimum number : " + min(arr));
        System.out.println("The number of prime numbers : " + primeNumbers(arr));
        System.out.println("The number of palindrome numbers : " + palindromeNumbers(arr));
        System.out.println("The number that has the maximum number of divisors : " + maxDivisors(arr));
    }

    public static int max(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }

    public static int min(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }
        return arr[minIndex];
    }

    public static int primeNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int N = arr[i];
            if (N == 2) {
                count++;
            } else if (N > 2) {
                boolean isPrime = true;
                for (int j = 3; j < N; j++) {
                    if (N % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int palindromeNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 10 == 0) {
                count++;
            } else if (arr[i] > 0) {
                int num = arr[i] % 10;
                int reversedNum = 0;
                reversedNum= reversedNum * 10 + num;
                num /= 10;
            }
        }
        return count;
    }
    public static int maxDivisors(int[] arr) {
        int maxIndex = 0;
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= max(arr); j++) {
                if (arr[i]%j==0){
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]==max(count)){
                maxIndex=i;
            }
        }
        return arr[maxIndex];
    }
}