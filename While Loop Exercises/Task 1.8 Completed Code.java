//Task 1.8 while loop exercise
//First, allow the user to input an integer. Use integer 99 to stop loop processing
//Have program control enter the while loop
//Within the loop:
//Display the current loop value
//Ask the user to input another integer value, using 99 to stop loop processing
import java.util.Scanner;
public class Task1_8
{
  public static void main (String args[])
   {
    // no input error trapping necessary on main arguments
    int i = 0;
    
    //User inital input portion
    Scanner userInput=new Scanner(System.in);
    System.out.println("Please enter first number:");
    i=userInput.nextInt();

    while (i!=99)
     {
         System.out.println("Number inputted: "+i);
         System.out.println("Please enter another number:");
         i=userInput.nextInt();


     }
    System.out.println("System Done Looping"); 
   }
}
