class Cat extends Pet
{
    
    
    public Cat()
    {
        
        PetType = "cat";
        Mood = "Indifferent";
        Name = "Friskers";
        Activity = "playing with cat nip.";
        
    }
    
    
    public void play()
    {
        Mood = "Impressed";

        System.out.println("You gave "+Name+" cat nip!");
        
        super.play();
        
        
    } 
    
    public String speak()
    {
        
        petSpeak = "Meow... meow...";
        
        
        return petSpeak;
        
    } 
    
    

}   
