import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int ID=Sc.nextInt();
        Sc.nextLine();
        String Name=Sc.nextLine();
        String Des=Sc.nextLine();
        if(ID>201)
            System.out.println(Name+","+ID+",21,000INR");
        else
            System.out.println("No Appraisal");
    }
}
