import java.util.Scanner;

public class Assignment01Driver {
    Scanner input = new Scanner(System.in);
    Scanner stringInput = new Scanner(System.in);
    public static void main(String[] args) {
        new Assignment01Driver();
    }

    // This will act as our program switchboard
    public Assignment01Driver() {
        String userInput = null;
        
        String[] cargohold = new String[10];

        System.out.println("Welcome to the BlackStar Cargo Hold interface.");
        System.out.println("Please select a number from the options below");
        System.out.println("");

        while (true) {
            // Give the user a list of their options
            System.out.println("1: Add an item to the cargo hold.");
            System.out.println("2: Remove an item from the cargo hold.");
            System.out.println("3: Sort the contents of the cargo hold.");
            System.out.println("4: Search for an item.");
            System.out.println("5: Display the items in the cargo hold.");
            System.out.println("0: Exit the BlackStar Cargo Hold interface.");

            // Get the user input
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice) 
            {
             case 1:
                System.out.println("You selected to add to your cargo bin!");
                System.out.println("Please enter item you'd like to enter into cargo bin:");
                userInput = stringInput.nextLine();
                addItem(cargohold,userInput);
                break;
             case 2:
                System.out.println("You selected to remove an item from your cargo bin!");
                System.out.println("Please enter an item you'd like to remove from your cargo bin:");
                userInput = stringInput.nextLine();
                removeItem(cargohold,userInput);
                break;
             case 3:
                System.out.println("Your Blackstar Cargo employee on duty is sorting the cargo as we speak...");
                sortItems(cargohold);
                System.out.println("The employee is done sorting here is the BlackStar Cargo hold sorted: ");
                displayItems(cargohold);
                break;
             case 4:
                System.out.println("Your Blackstar Cargo hold on duty is ready to help you search for any items you desire!");
                System.out.println("Please enter the item you'd like to search the cargo hold for: ");
                userInput = stringInput.nextLine();
                searchItems(cargohold, userInput);
                break;
             case 5:
                displayItems(cargohold);
                break;
             case 0:
                System.out.println("Thank you for using the BlackStar Cargo Hold interface. See you again soon!");
                System.exit(0);
                
             default:
                System.out.println("Please enter menu options '1' - '5' to manipulate BlackStar Cargo or '0' to exit.");
            }
        }

    }

    private void addItem(String cargohold[], String userInput) 
    {
        // TODO: Add an item that is specified by the user
        boolean flag = true;
        int counter = 0;
        
        while (flag)
        {
            if ((counter == 9) && (cargohold[counter]!= null))
            {
                System.out.println("Cargo bin is full, please remove items in order to add new items to cargo bin.");
                flag = false;
            }
            
                else if (cargohold[counter] != null)
                {
                    
                    counter++;
                    
                }
                
                    else
                    {
                        cargohold[counter] = userInput;
                        System.out.println("You successfully added " + userInput + " to your cargo bin!");
                        flag = false;
                    }
            

        }
        
        
    }

    private void removeItem(String cargohold[], String userInput) 
    {
        // TODO: Remove an item that is specified by the user
