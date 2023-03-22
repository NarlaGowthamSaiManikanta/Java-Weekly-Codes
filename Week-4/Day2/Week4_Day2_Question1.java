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
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            float value= Sc.nextFloat();
            if(value>0)
                arr[i]=(int)value;
            else
            {
                System.out.println("Invalid Array Elements");
                return;
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
