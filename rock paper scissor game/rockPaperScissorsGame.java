import java.util.Scanner;
public class rockPaperScissorsGame
{
    public static void main(String args[])
    {
     
        //initalizing variables
        boolean flag = true;
        int userMenuOption = 0;
        String computerChoiceMessage = null;
        String computerChoice = null;
        String userChoice = null;
        String winner = null;
        //welcome message
        System.out.println("Hello and welcome to the rock paper scissors simulator!");
        
        //creating scanner object
        Scanner uI = new Scanner(System.in);

        //looping the game
        while (flag)
        {
            
            double random = Math.random();
            
            if (random <= .3)
            {
                
                 computerChoiceMessage = "Computer chose scissors.";
                 computerChoice = "scissors";
            }    
            else if (random > .3 && random <= .6)
            {
                
                computerChoiceMessage = "Computer chose paper.";
                computerChoice = "paper";
            }    
            else
            {
                
                computerChoiceMessage = "Computer chose rock.";
                computerChoice = "rock";
            }
            
            //display menu options
            System.out.println("Computer has choosen now please make your selection:");
            System.out.println("Enter '1' for scissors");
            System.out.println("Enter '2' for paper");
            System.out.println("Enter '3' for rock");
            System.out.println("Enter '4' to exit");
            userMenuOption = uI.nextInt();
            System.out.println("");
            
            switch (userMenuOption)
            {
                case 1:
                System.out.println("You chose scissors");
                userChoice = "scissors";
                System.out.println(computerChoiceMessage);
                break;
                
                case 2: 
                System.out.println("You chose paper");
                userChoice = "paper";
                System.out.println(computerChoiceMessage);
                break;
                
                case 3:
                System.out.println("You chose rock");
                userChoice = "rock";
                System.out.println(computerChoiceMessage);
                break;
                
                case 4:
                System.out.println("Exiting game....");
                flag = false;
                break;
                
                default:
                System.out.println("Please choose either 1-3 to make your pick for the next game or 4 to exit program.");
                break;
            }    

            System.out.println("");
            
            //determining winner through scenerios 
            if (userChoice == "scissors" && computerChoice == "scissors")
            {
                winner = "it's a draw!";
                
            }
            else if (userChoice == "scissors" && computerChoice == "paper")
            {
                
                winner = "you!";
                
            }    
            else if(userChoice == "scissors" && computerChoice == "rock")
            {
                winner = "the computer!";
                
            }    
            else if (userChoice == "paper" && computerChoice == "scissors") 
            {
                winner = "the computer!";
                
            }  
            else if (userChoice == "paper" && computerChoice == "paper") 
            {
                winner = "it's a draw!";
                
            }  
            else if (userChoice == "paper" && computerChoice == "rock") 
            {
                winner = "you!";
                
            }  
            else if (userChoice == "rock" && computerChoice == "scissors")
            {
                winner = "you!";
                
            }    
            else if (userChoice == "rock" && computerChoice == "rock")
            {
                winner = "it's a draw!";
                
            }    
            else if(userChoice == "rock" && computerChoice == "paper")
            {
                winner = "the computer!";
                
            }  
            
            //winner message
            if (userMenuOption < 4)
            {
                
                System.out.println("The winner is: " + winner);
                System.out.println("");
            }    
            
        }
        //exiting game message
        System.out.println("Thank you for playing our rock paper scissor game!");
    }
}
