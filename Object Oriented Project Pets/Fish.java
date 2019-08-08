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
        
<<<<<<< HEAD
        
    }    
    
=======
    }    
    
        public void feedPet()
    {
        
        Food = "Vitamin C enriched flakes.";
        
        System.out.println("Your "+PetType +" is eating "+Food);
        
    }    
>>>>>>> 4d4737b2ef1b23d880c6755f30236e01a0fca953
    
}    
