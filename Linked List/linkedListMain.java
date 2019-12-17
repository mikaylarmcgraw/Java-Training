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
        int serialNumberEntered = 0;
        Scanner userInput = new Scanner(System.in);
        boolean test = true;
       
        
        System.out.println("Welcome to the Linked List simulator!");
        System.out.println("The program is designed to help you create and manipulate your own linked list.");
        System.out.println("");
        
        while (flag)
        {
            System.out.println("");
            System.out.println("Please select an option below for your link list:");
            System.out.println("1 - add a node to the head of linked list.");
            System.out.println("2 - add a node to the tail of linked list.");
            System.out.println("3 - remove a node from linked list.");
            System.out.println("4 - add node to the right of designated node.");
            System.out.println("5 - add node to the left of designated node.");
            System.out.println("6 - display linked list.");
            System.out.println("7 - display head of linked list.");
            System.out.println("8 - exit program.");
            System.out.println();
            menuOption = userInput.nextInt();
        
            switch (menuOption)
            {
                case 1:
                System.out.println("You selected: add a node to the head of linked list!");
                myLinkedList.addNodeToHead();
                break;
                
                case 2:
                System.out.println("You selected: add a node to the tail of linked list!");
                myLinkedList.addNodeToTail();
                break;
                
                
                case 3:
                System.out.println("You selected: remove a node from linked list!");
                myLinkedList.isLinkedListEmpty(test);
                test = myLinkedList.isLinkedListEmpty(test);
                if (test == false)
                {
                    
                    System.out.println("Please enter in a serial number of the node you'd like to remove:");
                    serialNumberEntered = userInput.nextInt();
                    System.out.println("You chose to remove node: "+serialNumberEntered);
                    System.out.println();
                }
                
                myLinkedList.removeNode(serialNumberEntered);
                System.out.println("Here is the updated linked list:");
                myLinkedList.displayLinkedList();
                break;
                
                case 4:
                System.out.println("You selected: add node to the right of designated node in your linked list!");
                System.out.println("Please enter in the serial number of the node you'd like to add to the right of:");
                serialNumberEntered = userInput.nextInt();
                myLinkedList.addToTheRight(serialNumberEntered);
                System.out.println("Here is your new linked list: ");
                myLinkedList.displayLinkedList();
                break;
                
                case 5:
                System.out.println("You selected: add node to the left of designated node in your linked list!");
                System.out.println("Please enter in the serial number of the node you'd like to add to the left of:");
                serialNumberEntered = userInput.nextInt();
                myLinkedList.addToTheLeft(serialNumberEntered);
                System.out.println("Here is your new linked list: ");
                myLinkedList.displayLinkedList();
                break;
                
                case 6:
                System.out.println("You selected: display linked list!");
                myLinkedList.displayLinkedList();
                break;
                
                case 7:
                myLinkedList.displayHead();
                break;
                
                case 8:
                System.out.println("Exiting program...");
                System.out.println("Thank you for using the Linked List Sumulator!");
                flag = false;
                break;
                
                default:
                System.out.println("Menu option entered is invalid.");
                System.out.println("Please enter options 1-7 to manipulate linked list or 8 to exit.");
                
            }
            
        }
        
        
    }
    
    
}  
