import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student
{
    String name; int registrationNo;
    void display()
    { 
        System.out.println(name+","+registrationNo);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        Student S=new Student();
        int ch=Sc.nextInt();
        if(ch==1)
        {
            Sc.nextLine();
            S.name=Sc.nextLine();
            do
            {
                S.registrationNo=Sc.nextInt();   
            }while(S.registrationNo<=0);
        }
        S.display();
    }
}
