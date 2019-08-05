
class Dog extends Pet
{

    public Dog()
    {
        
       PetType = "dog";  
       name = "Bark Twain"; 
       
       
        
    }    
    
    //using this later
    public Dog(String dogType)
    {
        
       PetType = dogType;  
        
        
    }    
    
    public void play()
    {
        Mood = "Happy!";
        
        System.out.println("You're playing fetch with "+name+"!");
        
        super.play();
        
        
    }    

            
}   
