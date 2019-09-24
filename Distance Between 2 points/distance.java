import java.util.*;
public class distance
{
  public static void main (String args[])
  {     
      //no input error trapping necessary on these main arguments
      
      //initalizing variables
      double x1 = 0;
      double y1 = 0;
      double x2 = 0;
      double y2 = 0;
      double xFactor = 0;
      double yFactor = 0;
      double result = 0;
      double squareRootExponent = .50;
      int squaredExponent = 2;
      
      Scanner userInput=new Scanner(System.in); //creating scanner object
      
      //display message
      System.out.println("Hello! Welcome to the distance calculator!");
      System.out.println("The program will ask you to enter two points and will then calculate the distance between the two.");
      System.out.println("The first point will be: (X1, Y1), the second point will be: (X2, Y2)");
      System.out.println("");
      
      //capturing user input for t
      System.out.println("Please enter X1 value:");
      x1 = userInput.nextDouble();
      System.out.println("Please enter Y1 value:");
      y1 = userInput.nextDouble();
      System.out.println("");
      System.out.println("Your first point entered is: (" + x1 +"," +y1 +").");
      System.out.println("");
      System.out.println("Please enter X2 value:");
      x2 = userInput.nextDouble();
      System.out.println("Please enter Y2 value:");
      y2 = userInput.nextDouble();
      System.out.println("Your second point entered is: (" + x2 +"," +y2 +").");
      
      //calculating the distance
      
      //first need to calculate the difference between the two x values and two y values
      xFactor = (x2 - x1);
      yFactor = (y2 - y1);
      
      //then need to square the difference in the x and y values
      xFactor = Math.pow(xFactor,squaredExponent);
      yFactor = Math.pow(yFactor,squaredExponent);
      
      //add the x and y dquared difference together and take the square root to calculate total distance between points
      result = Math.pow((xFactor + yFactor), squareRootExponent);
      
      System.out.println("");
      System.out.println("The distance between: (" + x1 +"," +y1 +") and (" + x2 +"," +y2 +") is: "+result);
     
      
      
  } 
}    
