import java.util.Scanner;

public class GCD {
    public static void main(String[] args)
    {
        Scanner pt = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = pt.nextInt();
        int b = pt.nextInt();

        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }
    public static int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
}
