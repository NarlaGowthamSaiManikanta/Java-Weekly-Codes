import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj= new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        if(a>=0&b>=0)
        {
            System.out.println(a+"-"+b);
        }
        else
            System.out.println("Invalid Input");
    }
}
