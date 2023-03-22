import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String first=Sc.next();
        String second=Sc.next();
        if(first.length()!=second.length())
        {
            System.out.println("Not Similar");
            return;
        }
        for(int i=0;i<first.length();i++)
        {
            int c1=0, c2=0;
            for(int j=0;j<first.length();j++)
            {
                if(first.charAt(i)==first.charAt(j))
                    c1++;
            }
            for(int k=0;k<second.length();k++)
            {
                if(first.charAt(i)==second.charAt(k))
                    c2++;
            }
            if(c1!=c2)
            {
                System.out.println("Not Similar");
                return;
            }
        }
       System.out.println("Similar");        
    }
}
