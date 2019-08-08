//Task 1.9 more looping 
//Inform the user of how the program will behave
//Allow the user two input integers
//While the first input value is less than the second value
/////Loop from the lower value through and including the upper value 
/////For each value, display the value and state whether it is even or odd 
/////Get two more integers from the user
import java.util.Scanner;
public class Task1_9
{
    public static void main(String args[])
    {
        //no input error trapping nexessary on main arguments
        int a = 0;
        int b = 0;
   
        System.out.println("This program is deisgned to loop through two integers you the user enter in the computer");
        System.out.println("The first number you enter into the program must be the smaller value and the second number entered must be the larger value.");
        System.out.println("Once the two integers are entered the program will begin loop. If larger value is entered first and smaller is entered second the loop will break.");
   
        //inital user input portion
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter first and smaller integer: ");
        a = userInput.nextInt();
        System.out.println("Please enter second and larger integer: ");
        b = userInput.nextInt();
   
        //testing condition 
        while (a < b)
        {
            //incrimenting and displaying odd and even text
            for(int i = a; i <= b; i++)
            {
                if ( i % 2 == 0 )
                {
                    System.out.println("Number is even: "+i);
                } 
                else
                {
                    System.out.println("Number is odd:  "+i);
                }    
            }
            
            //asking for two more integers from user
            System.out.println("Please enter first and smaller integer: ");
            a = userInput.nextInt();
            System.out.println("Please enter second and larger integer: ");
            b = userInput.nextInt();
        }
        
        System.out.println("System done looping to begin loop restart and make sure first integer entered is smaller than second integer.");
    }
}
