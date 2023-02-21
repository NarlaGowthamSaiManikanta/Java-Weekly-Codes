/*
Mehar's teacher taught her ascending and descending order. In order to test the clarity of the same concept she gave her an array of elements that contained N numbers. Help Mehar by developing the program for the same. The program ask for two choices, i.e to print ascending order or descending order. The program should print ascending order on entering 1 and descending order on entering 2. If duplicate elements exist in an array then it should only print once in the output.

Input Format
Number of elements in an array,N
Elements of an array
Enter one choice out of two(1 or 2)

Constraints
N should not be less than 5 and greater than 15.

Output Format
Sorted array depending on the choice

Sample Input 0
7
12 3 4 5 7 8 3
1

Sample Output 0
3 4 5 7 8 12

Sample Input 1
4

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
        int n=Sc.nextInt();
        if(n<5||n>15)
        {
            System.out.println("Invalid");
            return;
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=Sc.nextInt();
        Arrays.sort(a);
        int ch=Sc.nextInt();
        if(ch==1)
        {
            for(int i=0;i<n;i++)
            {
                if(i==0)
                    System.out.print(a[i]+" ");
                else if(a[i]!=a[i-1])
                    System.out.print(a[i]+" ");
            }
        }
        else if(ch==2)
        {
            for(int i=n-1;i>=0;i--)
            {
                if(i==n-1)
                    System.out.print(a[i]+" ");
                else if(a[i]!=a[i+1])
                    System.out.print(a[i]+" ");
            }
        }
    }
}
