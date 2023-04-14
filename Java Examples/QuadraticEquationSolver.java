import java.util.*;
public class QuadraticEquationSolver
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values : ");
        System.out.print("Enter the value of a := " );
        double a = input.nextDouble();
        System.out.print("Enter the value of b := ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c := " );
        double c = input.nextDouble();
        double d = -4 * a * c;

        {     // determinant > 0 //
            double root1 = (-b + Math.sqrt(Math.pow(b, 2) + d)) / (2 * a);
            double root2 = (-b - Math.sqrt(Math.pow(b, 2) + d)) / (2 * a);
            System.out.println("The Equation has Real Roots: ");
            System.out.println("First Root  is : " + root1);
            System.out.println("Secound Root is : " + root2);
        }
             // determinant = 0 //
        if (d == 0)
        {
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: " + root);
        }
        else
        {
            System.out.println("The equation has no real roots.");
        }
    }
}

