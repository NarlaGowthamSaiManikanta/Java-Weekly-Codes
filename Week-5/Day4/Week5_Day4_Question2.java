import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(),count=0;
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.next();
            int flag=0;
            for(int j=0;j<arr[i].length();j++)
            {
                if(arr[i].charAt(j)-'9'>0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                count++;
        }
        System.out.println(count);
        System.out.println(n-count);
    }
}
