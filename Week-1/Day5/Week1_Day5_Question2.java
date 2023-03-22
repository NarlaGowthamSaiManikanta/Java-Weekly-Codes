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
        long ac_no=obj.nextLong();
        obj.nextLine();
        String ac_ho=obj.nextLine();
        char ac_ho_gen=obj.next().charAt(0);
        int ac_wd=obj.nextInt();
        if(ac_ho_gen=='M')
            System.out.println("Hi Mr. "+ac_ho+"!");
        else
            System.out.println("Hi Ms. "+ac_ho+"!");
        if(ac_wd>20000)
            System.out.println("Insufficient Funds! You can not withdraw "+ac_wd+".");
        else
            System.out.println("Your Account Balance after withdrawl is "+(20000-ac_wd)+".");

    }
}
