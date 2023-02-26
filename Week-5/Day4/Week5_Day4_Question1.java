/*
Create a method named ‘factorial’ in your program that will display the factorial of any given number. factorial of an integer is the product of numbers ranging from 1 to N

Input Format
A single interger that represents the number whose factorial you need to find

Constraints
1<=N<=10

Output Format
Displays the output of number N

Sample Input 0
2

Sample Output 0
2
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        System.out.println(factorial(Sc.nextInt()));        
    }
}
