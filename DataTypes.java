
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        
        int sum;
        double doub;
        String str,str1;

        
        sum=scan.nextInt()+i;
        doub=scan.nextDouble()+d;
        str=scan.next()+scan.nextLine();
        str=str;

        
        System.out.println(sum);
        System.out.println(doub);
        System.out.println(s+str);
        

        scan.close();
    }
}
