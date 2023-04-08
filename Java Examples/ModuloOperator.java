import java.util.Scanner;
    public class ModuloOperator
    {
            public static void main(String[] args)
        {
            System.out.println("Enter Number ");
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enetr Main value :-");
                 int a = sc.nextInt();
            System.out.println("Enter devide Number :-");
                 int b = sc.nextInt();
            System.out.print("Your Reminder is:- ");
                 int c = a % b;
                 System.out.println(c);
        }
    }