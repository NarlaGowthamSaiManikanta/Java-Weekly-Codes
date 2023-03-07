import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class student
{
    String name;
    student(String n)
    {
        name=n;
        boolean flag=true;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)<65||(name.charAt(i)>90&&name.charAt(i)<97)||name.charAt(i)>122)
            {
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println(name);
        else
            System.out.println("Unknown");
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        student obj1=new student(Sc.nextLine());
        student obj2=new student(Sc.nextLine());
    }
}
