import java.io.*;
import java.util.*;

public class Solution {
    static boolean isBigger(int a,int b)
    {
        if(a>b)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n1=Sc.nextInt(),n2=Sc.nextInt();
        if(n1>10&&n1<1000&&n2>10&&n2<1000)
            System.out.println(isBigger(n1,n2));
        else
            System.out.println("Invalid Input");
    }
}
