import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String pass=Sc.nextLine();
        pass=pass.toLowerCase();
        char pass_n[]=pass.toCharArray();
        for(int i=0;i<pass_n.length;i++)
        {
            if(pass_n[i]==' ')
                pass_n[i]='$';
            System.out.print(pass_n[i]);
        }
    }
}
