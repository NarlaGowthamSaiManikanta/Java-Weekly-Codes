/*
Create a class Integer1 with an attribute of int type array and 2 methods named sum (calculate and returned the sum of array) and multiplication (calculate and returned the multiplication of array). Write a program to take the input of int array for Integer1 class. Give choice to user to display the sum or multiplication of array by using the above mentioned methods. User will only has 2 choices to calculate the sum or multiplication. If user will entered any other choice then display the message “Wrong Choice”.

Input Format
Your program should take the 3 types of input. • First input will represent the size of array. If the size will be negative, display the message “Invalid Array Size” without taking any other input. • Second input will be elements of array. • Third input will be user choice to calculate and display the sum or multiplication of array elements. o If the choice is 1 display the sum, o if 2 display the multiplication, o if any other value, display the message “Wrong Choice”.

Constraints
User will only have 2 valid choices

Output Format
Your program should display the sum or multiplication of array elements.

Sample Input 0
2
4
5
1

Sample Output 0
9
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Integer1
{
    int arr[];
    Integer1(int a)
    {
        arr=new int[a];
    }
    int add()
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum=sum+arr[i];
        return sum;
    }
    int mul()
    {
        int product=1;
        for(int i=0;i<arr.length;i++)
            product=product*arr[i];
        return product;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid Array Size");
            return;
        }
        Integer1 obj=new Integer1(n);
        for(int i=0;i<n;i++)
            obj.arr[i]=Sc.nextInt();
        int ch=Sc.nextInt();
        if(ch==1)
            System.out.println(obj.add());
        else if(ch==2)
            System.out.println(obj.mul());
        else
            System.out.println("Wrong Choice");
    }
}
