import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean isPrime(int a)
    {
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n>10&&n<50)
        {
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    if(isPrime(i))
                        System.out.print(i+" ");
                }
            }
        }
        else
            System.out.println("Invalid");
    }
}
