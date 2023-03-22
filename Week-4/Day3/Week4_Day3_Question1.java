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
        if(n<2)
            System.out.println("Invalid Array Size");
        else
        {
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=Sc.nextInt();
                if(arr[i]<0)
                {
                    System.out.println("Invalid Array Elements");
                    return;
                }
            }
            Arrays.sort(arr);
            System.out.println(arr[n-2]);
        }
    }
}
