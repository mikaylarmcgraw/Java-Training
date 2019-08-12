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
    
    public String speak(String petSpeak)
    {
        System.out.println("You chose to speak with "+Name);
        String response = null;
        switch (petSpeak)
        {
            case "hello":
            response = "What do you need.... meow meow?";
            break;
            
            case "praise":
            System.out.println("You chose to praise your "+PetType);
            response = "I know i'm a great "+PetType+" you're lucky to have me...";
            break;
            
            case "discipline":
            System.out.println("You chose to discipline your "+PetType);
            response = "you'll move on... get me some cat nip and maybe it will motivate me to behave";
            break;
            
            
            default:
            System.out.println("i'm sorry I don't know that command");
            response = "I'm confussed...stupid human";
            
        }    
        
        return "Your pet says: "+response;

    } 
    
    

}    
