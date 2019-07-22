    
//Adding to inttegers 0-5 together
	import java.util.Scanner;
	public class AddingInts
	{
	    public static void main(String args[])
	    {
	     Scanner userInput = new Scanner(System.in);
	     int a=0;
	     int b=0;
	     int c=0;
	     //no input error trapping needed no arguments entered
	     //setting display text for user to enter values 
	     System.out.println("Adding numbers");
	     System.out.println("Please enter in first number:");
	     a = userInput.nextInt();
	     System.out.println("Please enter in second number:");
	     b = userInput.nextInt();
	     c=a+b; 
	     
	     //setting conditions to add values and only accept those 0-5
	if (a<=5 && b<=5){
	    if (a>=0 && b>=0){
	            System.out.println("The sum of the two integers is:"+c);
	        }
	    } else{
	        System.out.println("Please only enter in integers between 0-5 to sum");
	    }
	
	if (a<0 || b<0){
	        System.out.println("Please only enter in integers between 0-5 to sum");
	  }
	
	    }
	}
