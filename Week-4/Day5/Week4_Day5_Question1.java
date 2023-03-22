import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        float m[][]=new float[Sc.nextInt()][];
        for(int i=0;i<m.length;i++)
        {
            m[i]=new float[Sc.nextInt()];
            for(int j=0;j<m[i].length;j++)
            {
                m[i][j]=Sc.nextFloat();
            }
        }
        int c=Sc.nextInt();
        float sum=0f;
        for(int i=0;i<m[c-1].length;i++)
        {
            sum=sum+m[c-1][i];
        }
        System.out.println("Average in Subject-"+c+" is "+(sum/m[c-1].length));
    }
}
