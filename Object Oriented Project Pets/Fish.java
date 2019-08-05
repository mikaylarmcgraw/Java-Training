class Fish extends Pet
{
    
    public Fish()
    {
    
        PetType = "fish";
        name = "Buck";
    
    }
    
    public void describeYourself()
    {
        Mood = "Mischievous";
        Activity = "swimming and blowing bubbles";
        
        super.describeYourself();
        
        
    }

    
    public void play()
    {
        Mood = "Meh... whatever";
        
        
        System.out.println("You're blowing bubbles with "+name+"!");
        
        super.play();
        
        
    }    
    
    
}    
