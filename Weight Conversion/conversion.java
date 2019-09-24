import java.util.*;
public class conversion
{
  public static void main (String args[])
  {     
      //no input error trapping necessary on these main arguments
      
      //initalizing variables
      double pounds = 0;
      double kgConversion = 0.454;
      double kilograms = 0;
      
      Scanner userInput=new Scanner(System.in); //creating scanner object
      
      
      //display message
      System.out.println("Hello welcome to the weight converter!");
      
      //prompting user to enter input and capturing that input
      System.out.println("Please enter an amount in pounds you'd like to convert to kilograms:");
      pounds = userInput.nextDouble();
      
      //converting to kilograms
      kilograms = pounds * kgConversion;
      
      
      //generating the output message
      System.out.println("You entered: " + pounds + " pounds. " + pounds + "lb(s) equates to: " + kilograms + "kg(s).");
      
    
    
  } 
}    
