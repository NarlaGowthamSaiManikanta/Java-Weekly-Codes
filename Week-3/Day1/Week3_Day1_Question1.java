import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char c=obj.next().charAt(0);
        int o=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                o++;
        }
        System.out.println(o);
    }
}
