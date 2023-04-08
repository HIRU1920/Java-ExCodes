import java.util.Scanner;

public class SwichCase
{
	public static void main(String[] args) {
	  int age;
	  
	  System.out.println("Enter your age : ");
	  Scanner sc = new Scanner(System.in);
	  age = sc.nextInt();

	  if (age>56)
	  {
	      System.out.println("You are Expirianced ");
	   }
	   else if(age>46)
	   {
	       System.out.println("You are semi-Expirianced ");
	   }
	    else if(age>36)
	   {
	       System.out.println("You are semi-semi-Expirianced ");
	   }
	    else
	    {
	        System.out.println("You are Verified for Driving Licence Lol ");
	    }
	  
	}
}
