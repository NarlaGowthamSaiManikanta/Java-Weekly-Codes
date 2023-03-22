import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        for(int i=0;i<=N;i++)
        {
            if(N==(i*i*i))
            {
                System.out.println("Perfect Cube");
                return;
            }
            else if(N<(i*i*i))
            {
                System.out.println("Not Perfect Cube");
                return;
            }
        }
        
    }
}
