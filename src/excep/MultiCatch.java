package excep;

public class MultiCatch {

	
	
	
	  public static void main(String[] args) {

		    System.out.println("begining");
		  
		    
		    try {
		      
		      //throw new RuntimeException(); 
		      System.out.println("trying ");
		      throw new IndexOutOfBoundsException();  
		      
		      
		    } catch (Throwable e) {
		      
		      System.out.println("catch block ");
		      // swallowing an exception : IndexOutOfBoundsException
		      throw new RuntimeException(); 
		      
		    } finally {
		      
		      System.out.println("finally ");
		      // swallowing an exception
		      throw new NullPointerException(); 
		      //System.out.println("aaaa");
		      
		    }
		    //System.out.println(" End ");
		    

		    
		  }
		  
		  
		  

		  
		}
		/// Task 1 

		/*
		 * create a method called reverse
		 * take one String as a parameter 
		 * return reversed String 
		 * 
		 * inside method first check whether the argument passed is null
		 * if it's null programmatically throw a NullPointerException
		 * reverse the String and return it from the method
		 * put the code in try catch block 
		 * call your method with valid string and null 2 times 
		 * 
		 * */
		
		
		
		
		
		
		
		
		
		
		
		

