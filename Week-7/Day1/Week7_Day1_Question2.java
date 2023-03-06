import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String para=Sc.nextLine();
        String word=Sc.next();
        int n=Sc.nextInt();
        if(n<=0)
        {
            System.out.println("Incorrect Input");
            return;
        }
        int p=-1;
        for(int i=0;i<=para.length()-word.length();i++)
        {
            if(para.charAt(i)==word.charAt(0))
            {
                int flag=0;
                for(int j=1;j<word.length();j++)
                {
                    if(para.charAt(i+j)!=word.charAt(j))
                    {
                        flag=1; break;
                    }
                }
                if(flag==0)
                {
                    p=i;    n--;
                }
            }
            if(n==0)
                break;
        }
        if(p==-1)
            System.out.println("Not Present");
        else
            System.out.println(p);
    }
}
