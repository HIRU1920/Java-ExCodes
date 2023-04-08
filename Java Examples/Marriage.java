import java.time.LocalDate;  
import java.time.Period; 
import java.util.Scanner;
public class Marriage
{
	public static void main(String[] args) {
		System.out.println("What is your name...? ");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		System.out.println("Hello " + name + " How are you...? Hope you are Fine...!");
		
		System.out.println("what is your partner name...? :");
		
		String name2 = sc.next();
		
		System.out.println("Congratulations to the wonderful two of " + name +" and "+ name2);
		
		System.out.print("Date of Marriage in YYYY-MM-DD format: ");  
        
        Scanner scanner = new Scanner(System.in);  

        String input = scanner.nextLine();  
        scanner.close();    
        LocalDate dob = LocalDate.parse(input);  

        System.out.println("You Complete " + calculateAge(dob) +" years of your Marriage...");  
        System.out.println("You two make this ‘love and marriage’ thing almost seem worth trying \n Just kidding—you look so happy, and I’m so happy for you!");

    }  

        public static int calculateAge(LocalDate dob)   
    {  
     
        LocalDate curDate = LocalDate.now();  
        if ((dob != null) && (curDate != null))   
    {  
        return Period.between(dob, curDate).getYears();  
    }  
        else  
     {  
        return 0;  
    } 
    }  
    }  
        
		 
