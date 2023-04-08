import java.util.Scanner; 

public class StringCases
{
	public static void main(String[] args) {
		    String a = "Heer";
	    System.out.print(" Name : ");
	    System.out.println(a);
	
	        //***** Find Length of the Name *****//
	
	    int value = a.length();
	    System.out.print(" Length of the Name : ");
	    System.out.println(value); 
	    
	    	//***** Write in  LowerCase *****//
	    
	    String lstring = a.toLowerCase();
	    System.out.print(" Write in a Lower Case : ");
	    System.out.println(lstring);
	
		    //***** Write in  UpperCase *****//
	    
	    String ustring = a.toUpperCase();
	    System.out.print(" Write in a Upper Case : ");
	    System.out.println(ustring);
	
	        //***** Trime Method *****//
	        
	    String nonTrimedString = "    HIR    ";
	    System.out.println(" Non Trime Method :");
	    System.out.println(nonTrimedString);
	    
	    String TrimedString = nonTrimedString.trim();
	    System.out.println(" Trime Method: ");
	    System.out.println(TrimedString);
	
	        //***** Substring *****//
	        
	    System.out.print(" substring : ");
	    System.out.println(a.substring(2));
	   
	    
	       //***** Substring [ int Start and int End ] *****//
	       
        System.out.print(" Start to End substring : ");
	    System.out.println(a.substring(1,3));
	   
	    
	       //***** Replace Single Character *****//
	       
	    System.out.print(" Replace Singleharacter : ");
	    System.out.println(a.replace('r','R'));
	    
	       //***** Replace Single Character *****//
	       
	    System.out.print(" Replace Multi Character : ");
	    System.out.println(a.replace("eer", "ir"));
	   
	       //***** Starts with *****//
	       
	    System.out.println(a.startsWith("Heer"));
	    
	       //***** Ends with *****//
	   
	    System.out.println(a.endsWith("ehr")); 
	   
	      //***** charAT function *****//
	      
	    System.out.println(a.charAt(2));
	    
	      //***** Index of *****//
	      
	    System.out.println(a.indexOf("r"));
	    
	      //***** Index of Start top End *****//
	      
	   String b = "HIRPATEL";
 	    
       System.out.println(b.indexOf("R",2));
	    
	    //***** Last Index *****//
	    
	   System.out.println(b.lastIndexOf("T"));
	    
	    //***** Last Index Start to End *****//
	    
	   System.out.println(b.lastIndexOf("R",3));
	    
	    //***** Equal *****//
	    
	   System.out.print(" Equal : ");
	   System.out.println(b.equals("HIRPATEL"));
	    
	   System.out.print(" Not Equal : ");
       System.out.println(b.equals("HIRPAteL"));
	   
	   //***** Equal Ignore Case *****//
	   
	   System.out.print(" Equals Ignore : ");
	   System.out.println(b.equalsIgnoreCase("hirpatel"));
	   
	   System.out.print(" Not Equal Ignore : ");
	   System.out.println(b.equalsIgnoreCase("HEER PATEL"));
	   
	   //***** Escape Sequence *****//
	   
	   System.out.println("Hey I am \" HEER  \" ");            /*Some more IMP Escape Sequences--- 
	   
	                                                      \t    Insert a tab in the text at this point.
                                                          \b	Insert a backspace in the text at this point.
                                                          \n	Insert a newline in the text at this point.
                                                          \r	Insert a carriage return in the text at this point.
                                                          \f	Insert a form feed in the text at this point.
                                                          \'	Insert a single quote character in the text at this point.
                                                          \"	Insert a double quote character in the text at this point.
                                                          \\	Insert a backslash character in the text at this point. */
	  
	}
}
