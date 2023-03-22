import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        float s[]=new float[3];
        int a[]=new int[3];
        for(int i=0;i<3;i++)
        {   
            s[i]=obj.nextFloat(); a[i]=(int)s[i];
            if(s[i]>a[i])
            System.out.print((a[i]+1)+" ");
            else
            System.out.print(a[i]+" ");
        }
    }
}
