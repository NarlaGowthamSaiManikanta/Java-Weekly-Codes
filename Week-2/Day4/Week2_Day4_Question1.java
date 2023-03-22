import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int o=obj.nextInt(), r=obj.nextInt(), m=obj.nextInt();
        if(o<=0||r<=0||m<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(o<10000)
                System.out.println((9*o/10)+(2*(8*r/10))+(3*(7*m/10)));
            else
                System.out.println((o/10)+(2*(2*r/10))+(3*(3*m/10)));
        }
    }
}
