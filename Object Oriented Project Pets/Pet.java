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
    String Activity = null;
    String Food = null;
    String Tolerance = null;
    Scanner pets = new Scanner(System.in);
    
    
    public Pet()
    {
         Mood = "happy";
         Tolerance = "medium";
         State = "alive";
         Activity = "playing";
         
    }
    
    //getting information on what pet user wants to know about
    public void describeYourself()
    {

        System.out.println("My new pet type is: "+PetType);
        System.out.println("My pet's mood is : "+Mood);
        System.out.println("My pet is : "+State);

      
    }
    
    public void footballTeam()
    {
        
        Team = "the Los Angeles Chargers" ;
        
        System.out.println("Your " +PetType +" likes "+Team);
    }
    
    
    // what are your pets doing/activity
    public void activity()
    {
        Activity = "playing";
        
        System.out.println("Your " +PetType +" is "+Activity);
        
    }
    
    public void exteriorCoat()
    {
  
           Exterior = "medium - long length soft fur.";
        
           System.out.println("Your "+PetType +" has "+Exterior); 
        
            
 
    }   
    
    public void feedPet()
    {
        
        Food = "dry kibble";
        
        System.out.println("Your "+PetType +" is eating "+Food);
        
    }    
  

        
}    
