import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Employee
{
    int id,age;
    Employee(int i, int a)
    {
        id=i;   age=a;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n>=1&&n<=10)
        {
            Employee E[]=new Employee[n];
            int least=0;
            for(int i=0;i<n;i++)
            {
                int id=Sc.nextInt(),    age=Sc.nextInt();
                if(10<=id&&id<=1000&&18<=age&&age<=50)
                {
                    E[i]=new Employee(id,age);
                    if(age<30&&age<E[least].age)
                        least=i;
                }
                else
                {
                    System.out.println("Invalid data");
                    return;
                }
            }
            if(E[least].age<30)
            System.out.println(E[least].id+" "+E[least].age);
        }
        else
            System.out.println("Invalid input");
    }
}
