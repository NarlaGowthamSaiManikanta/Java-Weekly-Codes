import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int c=obj.nextInt();
        float t=obj.nextFloat();
        if(c==1)
            t=(int)(t-32)*500/9;
        else if(c==2)
            t=(int)(t*900/5)+3200;
        else
        {
            System.out.println("INVALID CHOICE"); 
            return;
        }            
        System.out.println(t/100f);
    }
}
