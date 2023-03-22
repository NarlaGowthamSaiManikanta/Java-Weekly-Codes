import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        float balance=Sc.nextFloat();
        int option=Sc.nextInt();
        switch(option)
        {
            case 1:
                float amount=Sc.nextFloat();
                if(amount>balance)
                    System.out.println("Error");
                else
                    System.out.printf("%.2f",(balance-amount));
                break;
            case 2:
                float add= Sc.nextFloat();
                System.out.printf("%.2f",(balance+add));
                break;
            case 3:
                System.out.println(balance);
            default:
                System.out.println("Error");
                break;
        }
    }
}
