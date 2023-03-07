import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int l[]=new int[10];
        for (int i=0;i<10;i++)
            l[i]=Sc.nextInt();
       for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(l[j]>l[j+1])
                {
                    int s=l[j];
                    l[j]=l[j+1];
                    l[j+1]=s;
                }
            }
        }
         for (int i=0;i<10;i++)
            System.out.print(l[i]+" ");
    }
}
