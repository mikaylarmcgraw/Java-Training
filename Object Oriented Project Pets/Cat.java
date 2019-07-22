class Cat extends Pet
{
    
    
    public Cat()
    {
        
        PetType = "cat";
        
    
    
    }
    
    public void describeYourself()
    {
        Mood = "playful";
        
        System.out.println("My new pet type is: "+PetType);
        System.out.println("My pet's mood is : "+Mood);
        System.out.println("My pet is : "+State);
        
        
    }
    
     public void activity()
    {
        Activity = "playing with catnip";
        
        System.out.println("Your " +PetType +" is "+Activity);
        
    }
    
    
    
    public void exteriorCoat()
    {
    
    
       Exterior = "medium length soft fur."; 
        
       System.out.println("Your "+PetType +" has "+Exterior);  
    }    
}    