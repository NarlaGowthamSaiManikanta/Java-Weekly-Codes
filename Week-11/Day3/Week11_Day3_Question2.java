import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String s1=Sc.nextLine();
        String s2=Sc.nextLine();
        if(s1.length()>1 && s2.length()>1)
        {
            boolean flag=true;
            for(int i=0;i<s1.length();i++)
            {
                int c1=0,c2=0;
                for(int j=0;j<s1.length();j++)
                {
                    if(s1.charAt(i)==s1.charAt(j))
                        c1++;
                }
                for(int j=0;j<s2.length();j++)
                {
                    if(s1.charAt(i)==s2.charAt(j))
                        c2++;
                }
                if(c1!=c2)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("ANAGRAM");
            else
                System.out.println("NOT ANAGRAM");
        }
        else
            System.out.println("Invalid Input");
    }
}
