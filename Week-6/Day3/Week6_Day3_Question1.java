/*
Write a program to print the names of students by creating a Student class. If instead of name some other data type is passed then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.

Input Format
Rahul 33

Constraints
Use constructor with argument to initialize the name Create an object with name to print the name of the student Pass Two inputs such as one is name and the other with different data type

Output Format
Rahul Unknown

Sample Input 0
Rahul
33

Sample Output 0
Rahul
Unknown

Sample Input 1
Rahul
&

Sample Output 1
Rahul
Unknown
*/


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
