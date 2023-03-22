import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String Jas[] =new String[4];  String Jack[] =new String[4]; 
        int count=0;
        for(int i=0;i<4;i++)
            Jas[i]=Sc.next();
        for(int i=0;i<4;i++)
            Jack[i]=Sc.next();
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(Jack[j].equals(Jas[i]))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
