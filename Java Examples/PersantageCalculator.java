import java.util.Scanner;
public class PersantageCalculator
{
	public static void main(String[] args) {
		float your_marks;
		float total_marks;
		float persentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		your_marks = sc.nextFloat();
		
		System.out.println("Enter total marks : ");
		
		total_marks = sc.nextFloat();
		
    	persentage = (float)((your_marks / total_marks) * 100);
    	
    	System.out.println("persentage :: "+ persentage);
		 

         
	}
}
