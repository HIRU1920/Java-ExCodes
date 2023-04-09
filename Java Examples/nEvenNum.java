import java.util.*;

public class nEvenNum
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int count = (n + 1) / 2;
        System.out.println("Odd numbers from 1 to " + n);
        System.out.print("(");
        for (int i = 0; i <= n; i += 2)
        {
        total += i;
        System.out.print( + i + ",");
        }
        System.out.print(")");
        System.out.println("\nTotal odd numbers: " + count);
        System.out.println("Total Sum:"+total);
    }
}
