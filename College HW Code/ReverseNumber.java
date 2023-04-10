 import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = ca.nextInt();
        int rev = reverse(a);
        System.out.println("Reversed number: " + rev);
    }
    public static int reverse(int a) {
        int rev = 0;
        while (a != 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a /= 10;
        }
        return rev;
    }
}

