class Fish extends Pet
{
    int fishFeedCounter = 0;
    
    
    public Fish()
    {
        Mood = "Mischievous";
        Activity = "swimming and blowing bubbles";
        PetType = "fish";
        Name = "Buck";
    
    }

    
    public void feed()
    {
        System.out.println("Your fish is eating vitamin C flakes!");
        
        fishFeedCounter++;
        if (fishFeedCounter == 2)
        {
            
           System.out.println("Your fish is feeling very full!");
           System.out.println("You may want to slow down on the feedings...");
            
        }    
        else if (fishFeedCounter == 3)
        {
            System.out.println("Oh know your fish died!!");
            State = "dead";
            
            
            
        }    
        
    }    

    public void play()
    {
        Mood = "Meh... whatever";
        
        
        System.out.println("You're blowing bubbles with "+Name+"!");
        
        super.play();
        
        
    }    
    
    public String speak(String petSpeak)
    {
        System.out.println("You chose to speak with "+Name);
        String response = null;
        switch (petSpeak)
        {
            case "hello":
            response = "ughh you again.... what do you want?";
            break;
            
            case "praise":
            System.out.println("You chose to praise your "+PetType);
            response = "Human I know I am a superior pet.....";
            break;
            
            case "discipline":
            System.out.println("You chose to discipline your "+PetType);
            response = "DON'T YOU DARE!!!";
            break;
            
            
            default:
            System.out.println("i'm sorry I don't know that command");
            response = "I'm confussed...you are truly frustraing..*eye roll*";
            
        }    
        
        return "Your pet says: "+response;

    } 
    
    
}  
