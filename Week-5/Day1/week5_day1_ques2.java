import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n<5||n>15)
        {
            System.out.println("Invalid");
            return;
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=Sc.nextInt();
        Arrays.sort(a);
        int ch=Sc.nextInt();
        if(ch==1)
        {
            for(int i=0;i<n;i++)
            {
                if(i==0)
                    System.out.print(a[i]+" ");
                else if(a[i]!=a[i-1])
                    System.out.print(a[i]+" ");
            }
        }
        else if(ch==2)
        {
            for(int i=n-1;i>=0;i--)
            {
                if(i==n-1)
                    System.out.print(a[i]+" ");
                else if(a[i]!=a[i+1])
                    System.out.print(a[i]+" ");
            }
        }
    }
}
