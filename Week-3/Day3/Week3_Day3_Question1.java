import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int value=Sc.nextInt();
        if(value%100!=0||value<100||value>20000)
        {System.out.println("Invalid Input"); return;}
        int oh=0,th=0,fh=0,tt=0;
        if(value>1000){
        tt=value/2000; value=value-(tt*2000);
        fh=value/500; value=value-(fh*500);
        th=value/200; value=value-(th*200);}
        oh=value/100; value=value-(oh*100);
        if(oh>0)
            System.out.println(oh+" 100 Notes");
        if(th>0)
            System.out.println(th+" 200 Notes");
        if(fh>0)
            System.out.println(fh+" 500 Notes");
        if(tt>0)
            System.out.println(tt+" 2000 Notes");
    }
}
