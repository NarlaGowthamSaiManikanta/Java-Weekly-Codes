import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class subject
{
    String Professor;   int Credits;
    subject(String p,int c)
    {
        Professor=p;    Credits=c;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc =new Scanner(System.in);
        subject Java =new subject("Shruti", 4);
        subject OS =new subject("Puneet Kumar", 3);
        subject AI =new subject("James William", 2);
        subject Android =new subject("Md. Adil Khan", 3);
        String sub=Sc.nextLine();
        switch(sub)
        {
            case "Java":
                System.out.println(Java.Professor+" "+Java.Credits);  break;
            case "OS":
                System.out.println(OS.Professor+" "+OS.Credits);  break;
            case "AI":
                System.out.println(AI.Professor+" "+AI.Credits);  break;
            case "Android":
                System.out.println(Android.Professor+" "+Android.Credits);  break;
            default:
                System.out.println("This subject is not running in this semester.");    break;
        }
    }
}
