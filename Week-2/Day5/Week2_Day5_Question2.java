import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        double n=obj.nextDouble();
        if(n>=0)
            System.out.println((int)n);
        else
            System.out.println("Invalid Input");
    }
}
