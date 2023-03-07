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
