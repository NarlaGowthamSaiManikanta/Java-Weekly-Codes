import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n1=Sc.nextInt();
        if(n1<=0)
        {
            System.out.println("Invalid");
            return;
        }
        int a1[]=new int[n1];
        for(int i=0;i<n1;i++)
            a1[i]=Sc.nextInt();
        int n2=Sc.nextInt();
        if(n2<=0)
        {
            System.out.println("Invalid");
            return;
        }
        int a2[]=new int[n2];
        for(int i=0;i<n2;i++)
            a2[i]=Sc.nextInt();
        int n3=Sc.nextInt();
        if(n3<=0)
        {
            System.out.println("Invalid");
            return;
        }
        int a3[]=new int[n3];
        for(int i=0;i<n3;i++)
            a3[i]=Sc.nextInt();
        int l=n1;
        if(n1>n2)
        {
            if(n2>n3)
                l=n3;
            else
                l=n2;
        }
        else
        {
            if(n1>n3)
                l=n3;
            else
                l=n1;
        }
        int com[]=new int[l];
        int p=0;
        for(int i=0;i<n1;i++)
        {
            int c1=0,c2=0;
            for(int j=0;j<n2;j++)
            {
                if(a2[j]==a1[i])
                {
                    c1=1;
                    break;
                }
            }
            for(int j=0;j<n3;j++)
            {
                if(a3[j]==a1[i])
                {
                    c2=1;
                    break;
                }
            }
            if(c1==1&&c2==1)
            {
                com[p]=a1[i];
                p++;
            }
        }
        for(int i=0;i<p-1;i++)
        {
            for(int j=0;j<p-1;j++)
            {
                if(com[j]>com[j+1])
                {
                    int swap=com[j];
                    com[j]=com[j+1];
                    com[j+1]=swap;
                }
            }
        }
        for(int i=0;i<p;i++)
            System.out.print(com[i]+" ");
    }
}
