class Cat extends Pet
{
    
    
    public Cat()
    {
        
        PetType = "cat";
        Mood = "Indifferent";
        Name = "Friskers";
        Activity = "playing with cat nip.";
        
<<<<<<< HEAD
=======
        name = "Friskers";
    
>>>>>>> c0b8e895b607fb4898e949c66a14e61669938e91
    }
    
    
    public void play()
    {
<<<<<<< HEAD
        Mood = "Impressed";

        System.out.println("You gave "+Name+" cat nip!");
        
        super.play();
=======
        Mood = "Indifferent";
        Activity = "playing with cat nip.";
        
        super.describeYourself();
>>>>>>> c0b8e895b607fb4898e949c66a14e61669938e91
        
        
    } 
    
<<<<<<< HEAD
    public String speak()
    {
        
        petSpeak = "Meow... meow...";
        
        
        return petSpeak;
=======
    public void play()
    {
        Mood = "Impressed";
        
        
        System.out.println("You gave "+name+" cat nip!");
        
        super.play();
        
>>>>>>> c0b8e895b607fb4898e949c66a14e61669938e91
        
    } 
    
    

}    
<<<<<<< HEAD
    
=======
>>>>>>> c0b8e895b607fb4898e949c66a14e61669938e91
