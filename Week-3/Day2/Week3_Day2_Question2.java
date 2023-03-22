import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int r=Sc.nextInt();
        if(r<=0)
        {
            System.out.println("Invalid Input");
            return;
        }
        for(int i=1;i<=r;i++)
        {
            for(int j=0;j<i;j++)
                System.out.print("&");
            System.out.println();
        }
    }
}
