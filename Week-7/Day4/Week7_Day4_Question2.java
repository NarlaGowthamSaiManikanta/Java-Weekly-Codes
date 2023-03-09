import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String s=Sc.nextLine();
        if(s.length()<1)
        {
            System.out.println("Invalid Input");
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                System.out.println("Invalid input");
                return;
            }
        }
        String[] sa=s.split(" ");
        for(int i=0;i<sa.length;i++)
        {
            StringBuilder st=new StringBuilder();
            st.append(sa[i]);
            st=st.reverse();
            sa[i]=st.toString();
            System.out.print(sa[i].toLowerCase()+" ");
        }
    }
}
