
class Dog extends Pet
{
   
    public void play()
    {
        
        Mood = "very happy";
        
    }    
    
    
    public Dog()
    {
        
       PetType = "dog";  
        
        
    }    
    
    public Dog(String dogType)
    {
        
       PetType = dogType;  
        
        
    }    
    

    
    public void activity()
    {
        
        Activity = "running around";
        
        System.out.println("Your dog is "+Activity);
        
        
    }    

            
}   