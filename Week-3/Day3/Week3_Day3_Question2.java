import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String prime(int n)
    {
        int flag=0;
        if(n==0||n==1)
            return "NO";
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {flag=1; break;}
        }
        if(flag==0)
            return "YES";
        else
            return "NO";
    }
    static int fact(int n)
    {
        if(n==1)
            return 1;
        int f=n*fact(n-1);
        return f;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(), o=Sc.nextInt();
        switch(o)
        {
            case 1: if(n%2==0)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                    break;
            case 2: if(n%2==0)
                        System.out.println("NO");
                    else
                        System.out.println("YES");
                    break;
            case 3: String p=prime(n);
                    System.out.println(p);
                    break;
            case 4: int v=fact(n);
                    System.out.println(v);
                    break;
            default:System.out.println("Invalid Input");
                    break;
        }
    }
}
