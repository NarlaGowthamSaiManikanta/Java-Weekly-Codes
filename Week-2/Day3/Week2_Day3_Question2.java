import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int h=obj.nextInt(), a=obj.nextInt(),p=a*100/h;
        System.out.println(p);
        if(p<75)
            System.out.println("No");
        else
            System.out.println("Yes");
        
    }
}
