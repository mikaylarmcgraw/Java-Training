import java.util.Scanner;
public class switchExercise
{
    public static void main(String args[])
    {
        //no input error trapping necessary
        
        //initializing variables
        int userInput = 0;
        String Mood = null;
        String Tolerence = null;
        boolean flag = true;
        
        //creating scanner object
        Scanner uI = new Scanner(System.in);
        
        //user display to enter in an activity for pet
        System.out.println("Your dog would like to interact.");
        System.out.println("Choose from the following interactions:");
        System.out.println("1 = play");
        System.out.println("2 = feed treat");
        System.out.println("3 = scold");
        System.out.println("4 = stop interacting and send your dog to bed");
        System.out.println("");
        
        while (flag)
        {
            //capture input
            System.out.println("What activity would you like to do with your dog?");
            userInput = uI.nextInt();
            switch (userInput) 
            {
              case 1:
                System.out.println("You're playing fetch with your dog!");
                Mood = "Happy";
                Tolerence = "High";
                System.out.println("Your dog's mood is: "+Mood);
                System.out.println("Your dog's tolerence is: "+Tolerence);
                break;
              
               case 2:
                System.out.println("You fed your dog a Beggin Strip.");
                Mood = "Happy! Stomach is full.";
                Tolerence = "Moderate";
                System.out.println("Your dog's mood is: "+Mood);
                System.out.println("Your dog's tolerence is: "+Tolerence);
                break;
              
              case 3:
                System.out.println("You scolded your dog for being a Broncos fan.");
                Mood = "Sad.";
                Tolerence = "Low.";
                System.out.println("Your dog's mood is: "+Mood);
                System.out.println("Your dog's tolerence is: "+Tolerence);
                break;
              
              case 4:
                flag = false;
                System.out.println("Your dog is sleeping now, interaction time over.");
                Mood = "Sleepy.";
                Tolerence = "High.";
                System.out.println("Your dog's mood is: "+Mood);
                System.out.println("Your dog's tolerence is: "+Tolerence);
                break;

                default:
                System.out.println("Please enter activity value 1-4 to continue interaction.");
                
            }
            System.out.println("");
        }  
    }

}    
