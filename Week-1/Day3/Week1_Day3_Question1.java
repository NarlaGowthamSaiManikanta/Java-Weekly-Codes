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
        long an=new Long(obj.nextLine());
        String ah=obj.nextLine();
        char ag=obj.next().charAt(0);
        int aa=obj.nextInt();
        
        if(ag=='M')
                System.out.println("Hi Mr. "+ah+"!");
            else
                System.out.println("Hi Ms. "+ah+"!");
        if(aa>20000)
            System.out.println("Insufficient Funds! You can not withdraw "+aa+".");
        else
            System.out.println("Your Account Balance after withdrawl is "+(20000-aa)+".");
    }
}
