import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int a[]= new int[3];
        for(int i=0;i<3;i++)
            a[i]=obj.nextInt();
        int s=(a[0]+a[1]+a[2])*10/3;
        float mean=(float)s/10;
        System.out.println(mean);
    }
}
