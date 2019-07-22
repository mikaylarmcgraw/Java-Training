class Fish extends Pet
{
    
    public Fish()
    {
    
        PetType = "fish";
    
    
    }
    
            public void describeYourself()
    {
        Mood = "indifferent";
        
        System.out.println("My new pet type is: "+PetType);
        System.out.println("My pet's mood is : "+Mood);
        System.out.println("My pet is : "+State);
        
        
    }
    
        public void activity()
    {
        Activity = "swimming and blowing bubbles";
        
        System.out.println("Your " +PetType +" is "+Activity);
        
    }
    
    
    
    public void exteriorCoat()
    {
                   
           Exterior = "slimy scales.";
        
           System.out.println("Your "+PetType +" has "+Exterior); 

        
    }    
        
    
}    