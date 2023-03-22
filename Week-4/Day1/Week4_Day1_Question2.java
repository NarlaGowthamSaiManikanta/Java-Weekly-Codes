import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc =new Scanner(System.in);
        int n=Sc.nextInt();
        if(n>0)
        {
            int total=0;
            while(n>0)
            {
                total=total+Sc.nextInt();
                n--;
            }
            System.out.println(total);
        }
        else
            System.out.println("Invalid");
    }
}
