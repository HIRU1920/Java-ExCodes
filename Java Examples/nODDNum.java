import java.util.*;

public class nODDNum {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int count = (n + 1) / 2;
        System.out.println("Odd numbers from 1 to " + n);
        System.out.print("(");
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0) {
                
                total += i;
            }
            System.out.print( + i + ",");
           
        }
         System.out.print(")");
        System.out.println("\nTotal odd numbers: " + count);
        System.out.println("Total Sum:"+total);
    }
}
