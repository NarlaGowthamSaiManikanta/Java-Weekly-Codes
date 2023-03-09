import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public boolean isPalindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        Solution obj=new Solution();
        String str=Sc.nextLine();
        if(str.length()<1||str.length()>1000)
        {
            System.out.println("Invalid Input");
            return;
        }
        if(obj.isPalindrome(str))
        {
            System.out.println("true");
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            String n=str.replace(str.charAt(i)+"","");
            if(obj.isPalindrome(n))
            {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
