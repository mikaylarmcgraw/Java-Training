import java.util.Scanner;
class stackRun
{

    
    public static void main(String args[])
    {
        // no input error trapping necessary
        
        //creating myStack object of type stack
        stack myStack = new stack();

        //initializing variables
        
        int userIntegerEntered = 0;
        int userOptionsStack = 0;
        boolean flag = true;
        Scanner integerScanner = new Scanner(System.in);

        //opening message of program
        System.out.println("Hello welcome to the Stack Simulator!");
        System.out.println("");
        System.out.println("Your stack has 5 open spaces for you to enter in integers.");
        System.out.println("You're able to \"push\" in integers");
        System.out.println("You're able to \"pull\" off integers");
        System.out.println("You're also able to \"peek\" to show the integer on top in your stack");
        System.out.println("You can also display all the integers in your array");
        System.out.println("");
        
        //looping program for user
        while (flag)
        {
                System.out.println("Please select a command you'd like to do in your stack!");
                System.out.println("");
                System.out.println("Enter 1 to push a number into the stack");
                System.out.println("Enter 2 to pop a number off the stack");
                System.out.println("Enter 3 to peek at the number on top of the stack");
                System.out.println("Enter 4 to display all elements in the stack");
                System.out.println("Enter 5 to exit the program");
                userOptionsStack = integerScanner.nextInt();

                switch (userOptionsStack)
                {
                    case 1:
                    System.out.println("Please enter the first number you'd like within your Stack!");
                    userIntegerEntered = integerScanner.nextInt();
                    myStack.push(userIntegerEntered);
                    break;
                    
                    case 2:
                    System.out.println("You chose pop!");
                   myStack.pop();
                    break;
                   
                    case 3:
                    System.out.println("You chose peek!");
                    myStack.peek();
                    break;
                    
                    case 4:
                    System.out.println("You chose to display all elements of array.");
                    myStack.displayStack();
                    break;
                    
                    case 5:
                    System.out.println("Now exiting program.");
                    flag = false;
                    break;
                    
                    default: 
                    System.out.println("The integer you entered is invalid.");
                    System.out.println("Please choose an option between 1-4 to manipulate your stack or 5 to exit.");
                    break;
                    
                }
            
        }
    
        System.out.println("Thank you for playing with the Stack Simulator!");
    }
    
    
}
