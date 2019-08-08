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
    
    
<<<<<<< HEAD

}    
    
=======
       Exterior = "medium length soft fur."; 
        
       System.out.println("Your "+PetType +" has "+Exterior);  
    }    
}    
>>>>>>> 4d4737b2ef1b23d880c6755f30236e01a0fca953
