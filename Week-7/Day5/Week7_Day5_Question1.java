import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String s=Sc.nextLine();
        char m=s.charAt(0);
        int m_c=0;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))
            {
                int count=0;
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                        count++;
                }
                if(count>m_c)
                {
                    m=s.charAt(i);
                    m_c=count;
                }
            }
            else
            {
                System.out.println("Error");
                return;
            }
        }
        System.out.println("Maximum occurring character is: "+m);
    }
}
