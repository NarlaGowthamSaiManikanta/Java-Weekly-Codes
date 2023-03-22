import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        boolean f=true;
        if(n==1||n==0)
            f=false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                f=false;
        }
        if(f)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
