import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        a=a+(a/10);
        System.out.println(a);
        a=a*100/12;
        System.out.println(a/100f);
    }
}
