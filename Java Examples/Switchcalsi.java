import java.util.Scanner;

public class Switchcalsi
{
  
public static void main (String args[])
  {
    
Scanner sc = new Scanner (System.in);
    
System.out.println ("Enter value of 1st number ::");
    
int a = sc.nextInt ();
    
 
System.out.println ("Enter value of 2nd number ::");
    
int b = sc.nextInt ();
    
 
System.out.println ("Select operation");
    
System.out.println (" + , - , * , / ");
    
char ch = sc.next ().charAt (0);
    
switch (ch)
      {
      
case '+':
	
System.out.println ("Sum of the given two numbers: " + (a + b));
	
break;
      
case '-':
	
System.out.println ("Difference between the two numbers: " +
			     (a - b));
	
break;
      
case '*':
	
System.out.println ("Product of the two numbers: " + (a * b));
      
case '/':
	
System.out.println ("Result of the division: " + (a / b));
	
break;
      
default:
	
System.out.println ("Invalid grade");
      
}
  
}

}
