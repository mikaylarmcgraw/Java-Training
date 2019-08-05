class Cat extends Pet
{
    
    
    public Cat()
    {
        
        PetType = "cat";
        
        name = "Friskers";
    
    }
    
    public void describeYourself()
    {
        Mood = "Indifferent";
        Activity = "playing with cat nip.";
        
        super.describeYourself();
        
        
    }
    
    public void play()
    {
        Mood = "Impressed";
        
        
        System.out.println("You gave "+name+" cat nip!");
        
        super.play();
        
        
    } 
    
    

}    
