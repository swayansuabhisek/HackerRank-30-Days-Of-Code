import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Day10 {

    static void binary(int n){
        int[] binaryNum = new int[1000];
        int i = 0,j;
        while(n >0){
            binaryNum[i] = n % 2;
            n = n/2;
            i++;
        }
        for(j = i-1; j >= 0;j--){
            int op[] = Integer.parseInt(j);
        }
        int count = 0;
        for(int k = 0; k < j;k++){
            for(int l = k+1;l < j;l++){
                if(op[k] == op[l] == 1){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        binary(n);
        scanner.close();
    }
}
