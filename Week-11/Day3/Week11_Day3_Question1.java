import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String s1=Sc.nextLine();
        String s2=Sc.nextLine();
        if(s1.length()>2 && s2.length()>2)
        {
            boolean flag=true;
            for(int i=0;i<3;i++)
            {
                if(s1.charAt(i)!=s2.charAt(s2.length()-i-1))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("GREAT");
            else
                System.out.println("TRY NEXT TIME");
        }
        else
            System.out.println("ERROR");
    }
}
