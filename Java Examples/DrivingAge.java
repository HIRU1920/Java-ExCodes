import java.util.Scanner;

public class DrivingAge
{
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Age:- ");
     int age = sc.nextInt();
      // boolean cond =(age==18);
     //if (cond){
     if(age>18){
         System.out.println("Yes you can drive !");
     }
     else{
         System.out.println("No you cannot drive yet !");
     }
     
  }
}
	
