
//Pets Revision

import java.util.Scanner;
public class Pet
{
    //initalizing variables
    String PetType = null;
    String Exterior = null; 
    String Mood = null;
    String Team = null;
    String State = null;
    String Name = null;
    String Activity = null;
    String Food = null;
    String Tolerance = null;
    String petSpeak = null;
    Scanner pets = new Scanner(System.in);
    
    //not messing with constructor right now will come back to it later
    public Pet()
    {
         Mood = "Happy";
         State = "Alive";
         Activity = "Playing";
    }
    //getting information on what pet user wants to know about
    public void petsInFarm()
    {
        System.out.println("Enter \"dog\" to learn more about Bark Twain");
        System.out.println("Enter \"cat\" to learn more about Friskers");
        System.out.println("Enter \"fish\" to learn more about Buck");
        
        
    }    
        
        
    public void describeYourself()
    {
        
        System.out.println("Pet choosen was: "+PetType);
        System.out.println("Your "+PetType+"'s name is: "+Name);
        System.out.println("Your pet's mood is: "+Mood);
        if (State == "dead")
        {
            
          System.out.println("Your pet is : "+State);  
          System.out.println("You're unable to access the "+PetType+" sorry :("); 
            
        }
        else
        {
            System.out.println("Your pet is: "+State);
            
        }    
        
        System.out.println(Name+" is "+Activity);
      
    }
   
    public void play()
    {
        
        
        
        System.out.println(Name+"'s mood is: "+Mood);   
        
    }    
    
    public void feed()
    {
        
        Food = "dry kibble";
        
        System.out.println("Your "+PetType +" is eating "+Food);
        Mood = "Full!";
        Tolerance = "Moderate";
        
    } 
    
    
    
    public void footballTeam()
    {
        
        Team = "the Los Angeles Chargers" ;
        
        System.out.println("Your " +PetType +" likes "+Team);
    }
    
    // what are your pets doing/activity
    public void activity()
    {
        System.out.println("Enter 1 to play");
        System.out.println("Enter 2 to feed");
        System.out.println("Enter 3 to scold");
        System.out.println("Enter 4 to speak to your pet");
        System.out.println("Enter 5 to select another pet to play with");
    }
    
    public void exteriorCoat()
    {
  
           Exterior = "medium to long length soft fur.";
        
           System.out.println("Your "+PetType +" has "+Exterior); 
        
            
 
    }   
    
   
    public void scold()
    {
        System.out.println("You scolded your "+PetType+" for being a Broncos fan!");
        
        Mood = "Sad";
        
        Tolerance = "Low";
        
        System.out.println(Name+"'s mood is: "+Mood);
        System.out.println("Your "+PetType+"'s tolerance is: "+Tolerance);


        
 
    } 
    
    public String speak()
    {
        System.out.println("You chose to speak with "+Name);
        
        return "Your pet says:"+petSpeak;
        
       
        
    }    
}    


