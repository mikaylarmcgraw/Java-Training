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
    String name = null;
    String Activity = null;
    String Food = null;
<<<<<<< HEAD
=======
    String Tolerance = null;
>>>>>>> 4d4737b2ef1b23d880c6755f30236e01a0fca953
    Scanner pets = new Scanner(System.in);
    
    
    public Pet()
    {
<<<<<<< HEAD
         Mood = "Happy";
         State = "Alive";
         Activity = "Playing";
=======
         Mood = "happy";
         Tolerance = "medium";
         State = "alive";
         Activity = "playing";
         
>>>>>>> 4d4737b2ef1b23d880c6755f30236e01a0fca953
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
        
        System.out.println("My new pet type is: "+PetType);
        System.out.println("Your "+PetType+"'s name is: "+name);
        System.out.println("My pet's mood is: "+Mood);
        System.out.println("My pet is : "+State);
<<<<<<< HEAD
        System.out.println(name+" is "+Activity);
=======

>>>>>>> 4d4737b2ef1b23d880c6755f30236e01a0fca953
      
    }
   
    public void play()
    {
        
        
        
        System.out.println(name+"'s mood is: "+Mood);   
        
    }    
    
    public void feedPet()
    {
        
        Food = "dry kibble";
        
        System.out.println("Your "+PetType +" is eating "+Food);
        
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
        System.out.println("Enter 4 to select another pet to play with");
    }
    
    public void exteriorCoat()
    {
  
           Exterior = "medium - long length soft fur.";
        
           System.out.println("Your "+PetType +" has "+Exterior); 
        
            
 
    }   
    
<<<<<<< HEAD
   
  
 
        
}    
=======
    public void feedPet()
    {
        
        Food = "dry kibble";
        
        System.out.println("Your "+PetType +" is eating "+Food);
        
    }    
  
>>>>>>> 4d4737b2ef1b23d880c6755f30236e01a0fca953

        
}    
