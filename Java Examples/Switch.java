import java.util.Scanner;

public class Switch
{
	public static void main(String[] args) {
	
	  int age;
	  
	  System.out.println("Enter your age : ");
	  Scanner sc = new Scanner(System.in);
	  age = sc.nextInt();
	  
	  switch (age){
	    case 18:
	   
	   System.out.println(" You are a adult ");
	     break;
	     
	     case 23:
	    System.out.println(" You are a joinig a Job ");
	      break;
	      
	      case 60:
	    System.out.println(" You are a retired ");
	      break;    
	          	  
	     default:
	    System.out.println(" Enjoy a Life"); 
	      
	     }
	     
	     System.out.println("Thank You for Using my Java Code ");

	}
}
