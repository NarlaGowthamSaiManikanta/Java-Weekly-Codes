import java.io.*;
import java.util.*;
interface Predicate
{
    public boolean test(String t);
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(); Sc.nextLine();
        String s[]= new String[n];
        for(int i=0;i<n;i++)
            s[i]=Sc.nextLine();
        Predicate obj=(t)->
        {
            if(t.charAt(t.length()-1)=='g')
                return true;
            return false;
        };
        for(int i=0;i<n;i++)
        {
            if(obj.test(s[i]))
                System.out.println(s[i]);
        }
    }
}
