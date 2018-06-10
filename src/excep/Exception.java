package excep;

public class Exception {

	public static void main(String[] args) {
		
	
		
		System.out.println("beginning");
		int [] array =  new int [4];
		
		
		try {
			
			System.out.println(array[4]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(" array indexout of bound");
			
			
		}
		
		
		System.out.println("done");
		
		
		
		
		
}
}