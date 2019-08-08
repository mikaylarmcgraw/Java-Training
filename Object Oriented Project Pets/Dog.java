
class Dog extends Pet
{

    public Dog()
    {
        
       PetType = "dog";  
<<<<<<< HEAD
       Name = "Bark Twain"; 
=======
       name = "Bark Twain"; 
>>>>>>> c0b8e895b607fb4898e949c66a14e61669938e91
       
       
        
    }    
    
    //using this later
    public Dog(String dogType)
    {
        
       PetType = dogType;  
        
        
    }    
    
    public void play()
    {
        Mood = "Happy!";
        
<<<<<<< HEAD
        System.out.println("You're playing fetch with "+Name+"!");
=======
        System.out.println("You're playing fetch with "+name+"!");
>>>>>>> c0b8e895b607fb4898e949c66a14e61669938e91
        
        super.play();
        
        
    }    

    public String speak()
    {
        
        petSpeak = "Woof woof! So so so so happy to see you!";
        
        
        return petSpeak;
        
    } 
    
            
}   
