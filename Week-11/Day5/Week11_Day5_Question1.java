import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(),percent=0;
        if(n>7)
        {
            System.out.println("Invalid");
            return;
        }
        for(int i=0;i<n;i++)
        {
           percent+=Sc.nextInt();
        }
        percent=percent/n;
        if(percent>90)
            System.out.println("A+");
        else if(percent>=70)
            System.out.println("A");
        else if(percent>=60)
            System.out.println("B");
        else if(percent>=50)
            System.out.println("C");
        else
            System.out.println("D");
    }
}
