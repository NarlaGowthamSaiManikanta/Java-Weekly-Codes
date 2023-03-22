import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n<0||n>99)
        {System.out.println("Invalid Input"); return;}
        for(int i=0;i<=n;i++)
            System.out.println(i);
        System.out.println("Games End");
    }
}
