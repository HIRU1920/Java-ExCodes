import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
		System.out.println("Hello Friends");
		
	    System.out.println("Input Nnumber ");
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Number 1 ");
	   
        //int a = sc.nextInt();
        
       // float a = sc.nextFloat();
        
        //System.out.println("Number 2");
        
        //int b = sc.nextInt();
        
        //float b = sc.nextFloat();
        
        //int sum = a+b;
        
       // float sum = a+b;
        
       //System.out.println("THE SUM OF THESE NUMBER");
        
        boolean b1 = sc.hasNextFloat();
        System.out.println(b1);
        
        //System.out.println(sum);
        
        String str = sc.nextLine();
        
        System.out.println(str);
        
	    
	}
}
