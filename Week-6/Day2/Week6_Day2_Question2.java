import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean check(int n)
    {
        if(n%6==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n>20&&n<400)
        {
            if(check(n))
                System.out.println("True");
            else
                System.out.println("False");
        }
        else
            System.out.println("Invalid Input"); 
    }
}
