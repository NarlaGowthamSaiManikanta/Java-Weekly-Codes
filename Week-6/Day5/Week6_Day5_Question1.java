import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Student
{
    String name=null;    int registrationNo=0;
    void Display()
    {
        System.out.println(name+","+registrationNo);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int ch=Sc.nextInt();
        Student s=new Student();
        switch(ch)
        {
            case 1:
                Sc.nextLine();
                s.name=Sc.nextLine();
                s.registrationNo=Sc.nextInt();
                while(s.registrationNo<=0)
                    s.registrationNo=Sc.nextInt();
                s.Display();
                break;
            case 2:
                s.Display();
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
