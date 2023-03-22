import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        obj.next();obj.next();obj.next();obj.next();
        int n=obj.nextInt();
        if(n<10||n>99)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int t=n/10; int o=n%10;
            int s=t+o; int p=t*o;
            if(s+p==n)
                System.out.println("Special two digit number");
            else
                System.out.println("Not a special two digit number");
        }
        
        
    }
}
