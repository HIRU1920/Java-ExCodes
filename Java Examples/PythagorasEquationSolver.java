import java.util.*;

public class PythagorasEquationSolver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Your Side :");
        System.out.println(" (i) [ AC = ? ] then write A ");
        System.out.println(" (ii) [ BC = ? ] then write B ");
        System.out.println(" (iii) [ AB = ? ] then write C ");
        System.out.print("Enter Here := ");
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'A':

                System.out.print("Enter Number AB := ");
                double a = sc.nextDouble();

                System.out.print("Enter Number BC:= ");
                double b = sc.nextDouble();

                double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
                System.out.print("Enter Number AC := " + c);

                 break;

            case 'B':

                System.out.print("Enter Number AC := ");
                double d= sc.nextDouble();

                System.out.print("Enter Number AB:= ");
                double e = sc.nextDouble();

                double f = Math.sqrt((Math.pow(d,2) - Math.pow(e,2)));
                System.out.print("Enter Number BC := " +f);
                break;

            case 'C':
                System.out.print("Enter Number AC := ");
                double g = sc.nextDouble();

                System.out.print("Enter Number BC:= ");
                double h = sc.nextDouble();

                double i = Math.sqrt((Math.pow(g, 2) - Math.pow(h, 2)));
                System.out.print("Enter Number AB := " + i);

                break;
        }
    }
}
