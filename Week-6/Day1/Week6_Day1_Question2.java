/*
Accpet one array of stings with all alphabets or integers string and count the number of alphabets or integers string present in the array.

Input Format
First line accepts the size of the array(n) Second line accepts the n elements.

Constraints
The array is String type n>0 else "Invalid"

Output Format
First line print the number of Integer strings present Second line prints the number of Alphabet strings present

Sample Input 0
5
Raj 77 101 99 Jio

Sample Output 0
3
2

Sample Input 1
0

Sample Output 1
Invalid
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(),count=0;
        if(n<=0)
        {
            System.out.println("Invalid");
            return;
        }
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.next();
            int flag=0;
            for(int j=0;j<arr[i].length();j++)
            {
                if(arr[i].charAt(j)-'9'>0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                count++;
        }
        System.out.println(count);
        System.out.println(n-count);
    }
}
