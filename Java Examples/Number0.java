import java.util.Scanner;
public class Number0
{
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        
        if(x>y)
        {
            if(x>z)
            {
                System.out.println("x");
            }
            else if (x==z)
            {
                System.out.println("x and z");
            }
            else
            {
                System.out.println("z");
            }
        }
        else if (x==y)
        {
            System.out.println("x and y");
        }
        else if (y>z)
        {
            System.out.println("y");
        }
        else if (y==z)
        {
            System.out.println("y and z");
        }
        else
        {
            System.out.println("z");
        }
        
        
        
    }
}