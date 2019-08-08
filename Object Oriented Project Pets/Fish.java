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
    
    public String speak()
    {
        
        petSpeak = "ugh.... you again...";
        
        
        return petSpeak;
        
    } 
    
    
}    