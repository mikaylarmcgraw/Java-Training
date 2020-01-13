import java.util.*;
public class BSTMain
{
    public static void main(String args[])
    {
       //no input error traping necessary
                
       //initalizing variables
       int menuOption = 0;
       boolean flag = true;
       int numberForBST = 0;
       
       BSTNode myNode = new BSTNode();
       
       BST myBSTFunctions = new BST();
       
       //creating my scanner object
       Scanner userInput = new Scanner(System.in);
       
       
       //intro message
       System.out.println("Hello and welcome to the Binary Search Tree (BST) Simulator!");
       System.out.println("The program is designed to help you build and understand trees.");
       System.out.println();

       
       while (flag)
       {
           System.out.println("Here are the following menu options: ");
           System.out.println("1 - Add to BST");
           System.out.println("2 - Display BST");
           System.out.println("3 - Exit BST Simulator");
           System.out.println();
           System.out.println("Please enter your menu option: ");
           menuOption = userInput.nextInt();
           
           switch (menuOption)
           {
           
               case 1:
               System.out.println("You chose: Add to BST.");
               System.out.println("What number would you like to enter on your tree: ");
               numberForBST = userInput.nextInt();
               myBSTFunctions.addToBST(numberForBST);
               break;
               
               case 2:
               System.out.println("You chose: Display BST.");
               myBSTFunctions.displayBST();
               break;
               
               case 3:
               System.out.println("Exiting program....");
               System.out.println("Thank you for playing with BST Simulator!");
               flag = false;
               break;
               
               default:
               System.out.println("Please select menu options 1 - 2 to manipulate BST or 3 to exit.");
           
           
           }
           
       }
       
    
    }
    
}
