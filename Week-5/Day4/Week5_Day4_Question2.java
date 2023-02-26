/*
WAP to accpet one array of stings and integers.and count the number of stings and integers present in the array. Example Input: First line Accept size of array second line accept all elements like Array = {"Raj", "77", "101", "99", "Jio"}
Output: 3 2

Input Format
First line accept sixe of the array(n) second line accepts the n elements/values .

Constraints
the array is one string type array and n>0

Output Format
First line print the number of Integers present Second line prints the number of Strings present

Sample Input 0
5
Raj 77 101 99 Jio

Sample Output 0
3
2
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
