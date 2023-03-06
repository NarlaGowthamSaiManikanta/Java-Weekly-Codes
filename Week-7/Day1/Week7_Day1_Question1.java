import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String ans=Sc.nextLine();
        int n=Sc.nextInt();
        double marks[]=new double[n];
        Sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String response=Sc.nextLine();
            for(int j=0;j<response.length();j++)
            {
                if(response.charAt(j)==ans.charAt(j))
                    marks[i]=marks[i]+1;
                else if(response.charAt(j)=='X'||response.charAt(j)=='x')
                {/*do nothing*/}
                else
                    marks[i]=marks[i]-0.25;
            }
            System.out.print(marks[i]+" ");
        }
    }
}
