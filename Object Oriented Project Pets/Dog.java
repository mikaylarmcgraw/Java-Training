import java.util.Scanner;
class Dog extends Pet
{
    boolean flag = true;
    int userInput = 0;
    
    Scanner uI = new Scanner(System.in);
    public Dog()
    {
        
       PetType = "dog";  
        
       
    }    
    
    //we will one day use this don't feel ignored
    public Dog(String dogType)
    {
        
       PetType = dogType;  
        
        
    }    

    public void activitiesWithDog()
    {
        System.out.println("Your "+PetType+" would like to interact.");
        System.out.println("Choose from the following interactions:");
        System.out.println("1 = play");
        System.out.println("2 = feed treat");
        System.out.println("3 = scold");
        System.out.println("4 = stop interacting and send your "+PetType+" to bed");
        while(flag)
        {
            //capture input
            System.out.println("what activity would you like to do with your "+PetType+"?");
            userInput = uI.nextInt();
            switch (userInput) 
            {
              case 1:
                System.out.println("You're playing fetch with your "+PetType+"!");
                Mood = "Happy";
                Tolerance = "High";
                System.out.println("Your "+PetType+"'s mood is: "+Mood);
                System.out.println("Your "+PetType+"'s tolerence is: "+Tolerance);
                break;
              
               case 2:
                System.out.println("You fed your "+PetType+" a Beggin Strip.");
                Mood = "Happy! Stomach is full.";
                Tolerance = "Moderate";
                System.out.println("Your "+PetType+"'s mood is: "+Mood);
                System.out.println("Your "+PetType+"'s tolerence is: "+Tolerance);
                break;
              
              case 3:
                System.out.println("You scolded your "+PetType+" for being a Broncos fan.");
                Mood = "Sad.";
                Tolerance = "Low.";
                System.out.println("Your "+PetType+"'s mood is: "+Mood);
                System.out.println("Your "+PetType+"'s tolerence is: "+Tolerance);
                break;
              
              case 4:
                flag = false;
                System.out.println("Your "+PetType+" is sleeping now, interaction time over.");
                Mood = "Sleepy.";
                Tolerance = "High.";
                System.out.println("Your "+PetType+"'s mood is: "+Mood);
                System.out.println("Your "+PetType+"'s tolerence is: "+Tolerance);
                break;

            }

        }  
    }    
    
  

            
}   
