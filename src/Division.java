//Taimur Sohrab
import java.util.Scanner;
 
class Division {
  public static void main(String[] args) {
 
	  int a, b, result;
	 
	  Scanner input = new Scanner(System.in);
	  System.out.println("Input two integers");
	 
	  a = input.nextInt();
	  b = input.nextInt();
	 
	  try{
		  if (b == 0) {
		    throw new IllegalArgumentException("Divisor is 0");
		  }
		  
		  result = a / b;
		  System.out.println("Result = " + result);
	  }
	  catch(IllegalArgumentException e){
		  System.out.println("Error: You cannot divide by 0!");
	  }
	  finally {
		    System.out.println("finally block will execute.");
	  }
  
  }
}