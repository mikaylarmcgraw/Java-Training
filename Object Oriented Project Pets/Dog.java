
class Dog extends Pet
{

    public Dog()
    {
        
       PetType = "dog";  
       Name = "Bark Twain"; 
       
       
        
    }    
    
    //using this later
    public Dog(String dogType)
    {
        
       PetType = dogType;  
        
        
    }    
    
    public void play()
    {
        Mood = "Happy!";
        
        System.out.println("You're playing fetch with "+Name+"!");
        
        super.play();
        
        
    }    

    public String speak()
    {
        
        petSpeak = "Woof woof! So so so so happy to see you!";
        
        
        return petSpeak;
        
    } 
    
            
}   
