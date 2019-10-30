//the task in this assignment is to have the user enter a string and only display the odd characters

import java.util.Scanner;
public class Odd
{
    public static void main(String args[])
    {
       //no input error trapping necessary
       
       //initalizing variables
       String userInputString = null;
       
       
       // creating my scanner object
       Scanner userInput = new Scanner(System.in);
       

       
       //capturing user input
       System.out.println("");
       System.out.println("Please enter any string you'd like:");
       
       userInputString = userInput.nextLine();
        
       //creating char array
       char [] stringToCharArray = userInputString.toCharArray();
       
       System.out.println("Displaying only odd character positions the string looks like: ");
       
       System.out.println("");
       
       //looping through array of char to display only even indexes and 0 since array counting begins at 0 not 1. Odd letters will be at even indexes
       
       for (int i = 0; i<stringToCharArray.length; i++)
       {
           if (i == 0  || i % 2 == 0)
           {
               
               System.out.print(stringToCharArray[i]);
               
           }
           
       }    
       
    }

}    
