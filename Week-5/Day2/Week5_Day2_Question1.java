import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Complex
{
    int real=0, imaginary=0;
    Complex(){};
    Complex(int r,int i)
    {real=r;imaginary=i;};
}

public class Solution {
    static void Mul_Complex(Complex o1,Complex o2)
    {
        int r=(o1.real*o2.real)-(o1.imaginary*o2.imaginary);
        int i=(o1.real*o2.imaginary)+(o1.imaginary*o2.real);
        System.out.println(r+"+"+i+"i");
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        Complex C1,C2;
        String V1=Sc.nextLine();
        if(V1.length()==3)
            C1=new Complex(V1.charAt(0)-'0',V1.charAt(2)-'0');
        else if(V1.length()==1)
            C1=new Complex(V1.charAt(0)-'0',0);
        else
            C1=new Complex();
        String V2=Sc.nextLine();
        if(V2.length()==3)
            C2=new Complex(V2.charAt(0)-'0',V2.charAt(2)-'0');
        else if(V2.length()==1)
            C2=new Complex(V2.charAt(0)-'0',0);
        else
            C2=new Complex();
        Mul_Complex(C1,C2);
    }
}
