import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            String s= sc.next();
            char[] a,b= new char[s.length()/2];
            int z=0,x=0;
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    a[z]=s[i];//same
                    z++;
                }else{
                    b[x]=s[i];//showing error;
                    x++;
                }
            }
            for(char i : a){
                System.out.print(i);
            }
            System.out.print(" ");
            for(char i: b){
                System.out.print(i);
            }
            System.out.println("");
            n--;
                
        }

    }
}

