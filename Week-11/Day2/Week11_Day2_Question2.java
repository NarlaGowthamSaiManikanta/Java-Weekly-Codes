import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 
 
public class Solution  
{ 
    public static void main(String[] args)  
    { 
    Scanner obj=new Scanner(System.in); 
    String s=obj.nextLine(); 
    if(s.length()>5) 
    { 
      char[] ch = s.toCharArray(); 
        Arrays.sort(ch); 
        int count = 1; 
        for (int i = 1; i < ch.length; i++) 
        { 
            if (ch[i] == ch[i-1])  
            { 
                count++; 
            }  
            else 
            { 
                System.out.print(ch[i-1] + "" + count); 
                count = 1; 
            } 
        } 
        System.out.print(ch[ch.length-1] + "" + count); 
    }  
        else 
        { 
        System.out.print("Invalid Input"); 
        } 
    } 
    }
