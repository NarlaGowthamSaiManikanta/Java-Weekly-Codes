import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        long code=obj.nextLong();
        int codein=0;
        int power=1;
        for(int i=0;i<8;i++)
        {
            int bit=(int)(code%10l);
            code=code/10l;
            codein=(bit)*(power)+codein;
            power=power*2;
        }
        if(codein>64&&codein<91)
        {
            char c=(char)codein;
            System.out.println(c);
        }
        else
            System.out.println("INVALID PAPER CODE");
    }
}
