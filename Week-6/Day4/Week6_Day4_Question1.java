import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public double[] average_marks(double [][] marks)
    {
        double store[]=new double[marks.length];
        for(int i=0;i<marks.length;i++)
        {
            double less=marks[i][0];
            for(int j=0;j<3;j++)
            {
                store[i]=store[i]+marks[i][j];
                if(marks[i][j]<less)
                    less=marks[i][j];
            }  
            store[i]=(store[i]-less)/2;
        }
        return store;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution obj=new Solution();
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        double marks[][]=new double[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
                marks[i][j]=Sc.nextDouble();
        }
        double out[]=obj.average_marks(marks);
        for(int i=0;i<n;i++)
        {
            System.out.print(out[i]+" ");
        }
    }
}
