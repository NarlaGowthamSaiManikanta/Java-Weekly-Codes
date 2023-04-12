import java.io.*;
import java.util.*;
interface A
{
    public String[] alphaSort(String[] M);
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String m[]=new String[3];
        m[0]=Sc.nextLine();
        m[1]=Sc.nextLine();
        m[2]=Sc.nextLine();
        A obj=(M) ->
        {
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2-i;j++)
                {
                    int k=0;
                    while(M[j].charAt(k)==M[j+1].charAt(k))
                    {
                        k++;
                        if(k==M[j].length()||k==M[j+1].length())
                           break; 
                    }
                    if(k==M[j].length()||k==M[j+1].length())
                    {
                        if(M[j].length()>M[j+1].length())
                        {
                            String temp=M[j];
                            M[j]=M[j+1];
                            M[j+1]=temp;
                        }
                    }
                    else if(M[j].charAt(k)>M[j+1].charAt(k))
                    {
                        String temp=M[j];
                        M[j]=M[j+1];
                        M[j+1]=temp;
                    }
                }  
            }
            return M;
        };
        m=obj.alphaSort(m);
        System.out.println(m[0]); System.out.println(m[1]); System.out.println(m[2]);       
    }
}
