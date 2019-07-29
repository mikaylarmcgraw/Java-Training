
import java.util.Scanner;
class petSimulator
{
    public static void main(String args[])
    {
        //no input error trapping necessary

        //Pets2 MyNewPet = new Pets2();
        Dog MyNewDog = new Dog();
        //Dog MySecondDog = new Dog("Bolt Up");
        Cat MyNewCat = new Cat();
        Fish MyNewFish = new Fish();
        
        //initializing variables
        String UserInput = null;
        String interactWithPet = null;
        String activityForPet = null;
        boolean flag = true;

        Scanner pets = new Scanner(System.in);
        
        System.out.println("Please enter a pet you'd like to learn about:");
        UserInput = pets.nextLine();  
        
        if (UserInput.equals("dog"))
        {
            //information about dog
            System.out.println("Here's information about your dog:");
            MyNewDog.describeYourself();
            MyNewDog.exteriorCoat();
            MyNewDog.footballTeam();
            System.out.println("");

            System.out.println("Do you want to interact with your pet?");
            interactWithPet = pets.nextLine(); 
            if (interactWithPet.equals("yes"))
            {
                MyNewDog.activitiesWithDog();
              
            }

        }
        else if (UserInput.equals("cat"))
        {
               //Cat Information
               System.out.println("Here's information about your cat:");
               MyNewCat.describeYourself();
               MyNewCat.activity();
               MyNewCat.exteriorCoat();
               MyNewCat.footballTeam();
               System.out.println("");
        }
        else if(UserInput.equals("fish"))
        {
               //Fish Information
               System.out.println("Here's information about your fish:");
               MyNewFish.describeYourself();
               MyNewFish.activity();
               MyNewFish.exteriorCoat();
               MyNewFish.footballTeam();
               System.out.println("");
        }
            


        
    }


}  
