//user input min max for loop
//task 1.6
import java.util.Scanner;
 public class Task1_6
  {
    public static void main (String args[])
     {
       // no input error trapping necessary on main arguments
       int a = 0;
       int b = 0;
  

  
       //User inputting numbers
       Scanner userInput=new Scanner(System.in);
  
       System.out.println("Please enter first and smaller number first:");
       a =userInput.nextInt();
  
       System.out.println("Please enter second and larger number:");
       b =userInput.nextInt();

       //if user inputs numbers incorrectly 
       if (a >=b) 
        {
           System.out.println("Please make sure first number is smaller than second number");
        } 
           //if condition works and is met:
           else
            { 
              for(int i=a; i<=b; i++)
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
            }
     }
 }
