import java.io.*;
import java.util.*;

public class Solution {
    static boolean valid(String str, int n)
    {
        boolean result=true;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<n)
            {
                result=false;
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String S=Sc.nextLine();
        int n=Sc.nextInt();
        if(n<1)
            System.out.println("Invalid input");
        else
        {
            if(valid(S,n))
                System.out.println("Valid string");
            else
                System.out.println("Invalid string");
        }
    }
}
