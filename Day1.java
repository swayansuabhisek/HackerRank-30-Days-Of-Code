import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double j = scan.nextDouble();
        scan.nextLine();
        String p = scan.nextLine();
        
        int a = n+i;
        double b = d+j;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(""+s+""+p);
        scan.close();
    }
}