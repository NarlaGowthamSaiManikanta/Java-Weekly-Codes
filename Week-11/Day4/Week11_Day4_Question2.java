import java.io.*;
import java.util.*;

public class Solution {
    static boolean isNumber(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-'0'>=0&&s.charAt(i)-'9'<=0){}
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(),count=0;
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=Sc.next();
            if(isNumber(s[i]))
                count++;
        }
        System.out.println(count);
        System.out.println(n-count);
    }
}
