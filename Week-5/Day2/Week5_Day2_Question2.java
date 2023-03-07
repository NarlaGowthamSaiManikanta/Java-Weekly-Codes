import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Circle
{
    static double radius;
    Circle(double r)
    {radius=r;};
    static double getArea()
    {
        if(radius>0)
        return (3.14*radius*radius);
        else
        return 0;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n<1)
        {System.out.println("Invalid input"); return;}
        for(int i=0;i<n;i++)
        {
            Circle c=new Circle(Sc.nextDouble());
            double area=Circle.getArea();
            if(area>30)
                System.out.println((int)(area*10000)/10000f);
        }
    }
}
