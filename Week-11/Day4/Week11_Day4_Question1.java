import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String s1=Sc.nextLine();
        String s2=Sc.nextLine();
        for(int i=0;i<=s1.length();i++)
        {
            if(s1.charAt(i)=='('||s1.charAt(i)=='{')
                System.out.print(s1.charAt(i));
            else
            {
                System.out.print(s2);
                for(int j=i;j<s1.length();j++)
                    System.out.print(s1.charAt(i));
                break;
            }
        }
    }
}
