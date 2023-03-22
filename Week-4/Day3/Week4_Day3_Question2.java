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
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Sc.nextInt();
            b[i]=a[i];
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");
    }
}
