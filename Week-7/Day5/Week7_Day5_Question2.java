import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String s=Sc.nextLine();
        int N=Sc.nextInt();
        if(N<1||N>10)
            System.out.println("Invalid Input");
        else{
            String[] w=s.split(" ");
            int count=0;
            for(int i=0;i<w.length;i++)
            {
                if(w[i].length()==N)
                    count++;
            }
            System.out.println(count);
        }
    }
}
