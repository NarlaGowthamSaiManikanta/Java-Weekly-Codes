import java.io.*;
import java.util.*;
class Student
{
    String name;
    int rollNo;
    String department;
}
interface A
{
    public boolean test(Student t);
}
public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n>1)
        {
            Student s[]=new Student[n];
            for(int i=0;i<n;i++)
            {
                s[i]=new Student();
                s[i].name=Sc.next();
                s[i].rollNo=Sc.nextInt();
                s[i].department=Sc.next();
                A obj=(t) ->
                {
                    if(t.department.equals("CSE"))
                        return true;
                    else
                        return false;
                };
                if(obj.test(s[i]))
                System.out.println(s[i].rollNo);
            }
        }
        else
         System.out.println("Invalid");
    }
}
