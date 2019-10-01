import java.util.*;
class linkedListMain
{
    public static void main(String args[])
    {
        //no input error traping necessary
        
        //creating object of type linkedList called myLinkedList
        linkedList myLinkedList = new linkedList();
        Node myNewNode = new Node();
        
        //initalizing variables
        int menuOption = 0;
        boolean flag = true;
        int test = 5;
        Node currentNode = null;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Welcome and welcome to the Linked List simulator!");
        System.out.println("The program is designed to help you create and manipulate your own linked list.");
        System.out.println("");
        
        while (flag)
        {
            System.out.println("");
            System.out.println("Please select an option below for your link list:");
            System.out.println("1 - add a node to the head of linked list.");
            System.out.println("2 - add a node to the tail of linked list.");
            System.out.println("3 - remove a node from linked list.");
            System.out.println("4 - display linked list.");
            System.out.println("5 - display head of linked list.");
            System.out.println("6 - exit program.");
            menuOption = userInput.nextInt();
        
            switch (menuOption)
            {
                case 1:
                System.out.println("You selected: add a node to the head of linked list!");
                myLinkedList.addNodeToHead();
                
                break;
                
                case 2:
                System.out.println("You selected: add a node to the tail of linked list!");
                break;
                
                case 3:
                System.out.println("You selected: remove a node from linked list!");
                break;
                
                case 4:
                System.out.println("You selected: display linked list!");
                myLinkedList.displayLinkedList();
                break;
                
                case 5:
                myLinkedList.displayHead();
                break;
                
                case 6:
                System.out.println("Exiting program...");
                System.out.println("Thank you for using the Linked List Sumulator!");
                flag = false;
                break;
                
                default:
                System.out.println("Menu option entered is invalid.");
                System.out.println("Please enter options 1-4 to manipulate linked list or 5 to exit.");
                
            }
            
        }
        
        
    }
    
    
}  
