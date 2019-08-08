
//Asking users how long they've been with company
//output one ask for salary and generate 5% bonus
//output to hasn't been there 5+ years not eligable
import java.util.Scanner;
public class Salary
{
    public static void main (String args[])
    {
      //no input error trapping necessary on main arguments
      //setting integers
       int numberofyears=0;
       int salary=0;
       double bonus=0;
       //user input portion
       Scanner userInput = new Scanner(System.in);
       System.out.println("Please enter numerically how many years you've been with the company:");
       numberofyears=userInput.nextInt();
       if (numberofyears >=5){
           System.out.println("Please enter salary amount:");
           salary = userInput.nextInt();
        } else{ System.out.println("I'm sorry you aren't eligable for a bonus.");
        }
       //Calculating bonus portion
        bonus=(salary*.05);
        System.out.println("Your bonus this year will be:"+bonus);
        
      
  
        
    }
}
