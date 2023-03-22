import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String day=Sc.nextLine();
        switch(day)
        {
            case "Monday":case "Tuesday":case "Wednesday":case "Thursday":case "Friday":
                {   System.out.println("8:30 5:30"); break; }
            case "Saturday":
                {   System.out.println("9:30 4:30"); break; }
            default:
                {   System.out.println("Library is closed"); break; }
        }
    }
}
