//Task 1.11 do while looping 
//Inform the user of how the program will behave
//Ask the user to input an integer other than 99
//Do the following until the user enters 99:
////If the integer is odd, display to the user the value of the integer squared
////If the integer is even, display the value of the integer multiplied by 10
////Ask the user for another integer 
//Where appropriate, inform the user that the program is done looping

import java.util.Scanner;
public class Task1_12
{
    public static void main(String args[])
    {
        //no input error trapping nexessary on main arguments
        
        //explain to user how the program works
        System.out.println("Please input any integer other than 99.");
        System.out.println("If integer entered is odd, program will display the value of the integer squared.");
        System.out.println("If integer entered is even, program will display the value of the integer multipled by 10.");
        
        //identifying integer(s)
        int a = 0;
        int stoplooping = 99;
        int multiplier = 10;
        
        //user input displayed 
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter integer to begin looping, entering integer 99 will stop looping process: ");
        a = userInput.nextInt();
       
        //conditions set
        if(a != stoplooping)
        {
            do
            {
                if ( a % 2 == 0 )
                {
                    System.out.println("Value entered in is: "+a);
                    System.out.println("Value entered in is even. Value multiplied by 10 is: "+a*multiplier);
                }
                else
                {
                    System.out.println("Value entered in is: "+a);
                    System.out.println("Value entered in is odd. Value squared is: "+Math.pow(a,2));
                }   

                //asking user to enter in another integer
                System.out.println("Please enter in another integer: ");
                a=userInput.nextInt();
            }
            while (a != stoplooping);

        }
        
        //broken out of loop comment
        System.out.println("System done looping, integer 99 breaks out of looping process.");

    }    
}
