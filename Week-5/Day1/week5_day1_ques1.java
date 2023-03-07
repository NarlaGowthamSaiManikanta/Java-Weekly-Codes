import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Employee
{
    int id,age;
    Employee(int i,int a)
    {
        id=i;   age=a;
    }
    void print()
    {
        if(age<30)
        System.out.println(id+" "+age);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Employee E=new Employee(Sc.nextInt(),Sc.nextInt());
            E.print();
        }
    }
}

