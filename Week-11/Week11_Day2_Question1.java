import java.util.*;

public class SortStrings {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if (n < 2) {
            System.out.println("Invalid");
            return;
        }
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.next();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) 
        {
            System.out.println(arr[i]);
        }
    }
}
