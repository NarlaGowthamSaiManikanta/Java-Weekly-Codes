/*
Richa and her daughter Ahaana are playing a game. Richa is going to tell one number and Ahaana need to tell the prime factors of the number. Help Ahaana by completing the code to find prime factor of the number. Write a method which calculate prime factors and print and call the method in main.

Input Format
An integer value

Constraints
N will lie between 10-50 else "Invalid"

Output Format
All the prime factors will be printed exactly once with space in increasing order.

Sample Input 0
8

Sample Output 0
Invalid

Sample Input 1
30

Sample Output 1
2 3 5
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean isPrime(int a)
    {
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n>10&&n<50)
        {
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    if(isPrime(i))
                        System.out.print(i+" ");
                }
            }
        }
        else
            System.out.println("Invalid");
    }
}
