
import java.util.Scanner;
class petSimulator
{
    public static void main(String args[])
    {
        //no input error trapping necessary

        //Pets2 MyNewPet = new Pets2();
        Pet currentPet = null;
        Dog MyNewDog = new Dog();
        Dog MySecondDog = new Dog("Bolt Up");
        Cat MyNewCat = new Cat();
        Fish MyNewFish = new Fish();
        
        //initializing variables
        String UserInput = null;
        int interactWithPet = 0;
        boolean flagloop1 = true;
        boolean flagloop2 = true;
        Scanner pets = new Scanner(System.in);
        
        //welcome message
        System.out.println("Welcome to Pet Simulator!!");
        System.out.println("I'll be happy to teach you more about our pet farm!");
        

        //begining loop have user choose which animal to learn about
        while (flagloop1)
        {
            flagloop2 = true;
            System.out.println("");
            System.out.println("Please enter a pet you'd like to learn more information about or enter \"exit\" to end Pet Simulator"); 
            System.out.println("Here's the available pet options in our farm:");
            System.out.println("Enter \"dog\" to learn more about Bark Twain");
            System.out.println("Enter \"cat\" to learn more about Friskers");
            System.out.println("Enter \"fish\" to learn more about Buck");
            UserInput = pets.nextLine();
            System.out.println("");
            switch (UserInput)
            {
                //asigning currentPet to object
                
                case "dog":
                currentPet = MyNewDog;
                System.out.println("Here's information about your pet: ");
                currentPet.describeYourself();
                break;
                
                case "cat":
                currentPet = MyNewCat;
                System.out.println("Here's information about your pet: ");
                currentPet.describeYourself();
                break;
                
                case "fish":
                currentPet = MyNewFish;
                System.out.println("Here's information about your pet: ");
                currentPet.describeYourself();
                break;
                
                case "exit":
                flagloop1 = false;
                flagloop2 = false;
                break;
                
                default:
                System.out.println("I don't know much about that pet please enter: dog, cat or fish to learn more about our animals.");
                System.out.println("Please enter \"exit\" to end Pet Simulator.");
            
            }    

            
            while (flagloop2 == true)
             {   
                System.out.println("");
                System.out.println("Here are the different activites you can do with your pet:");
                currentPet.activity();
                interactWithPet = pets.nextInt();
                switch (interactWithPet)
                {
                    case 1:
                    System.out.println("You selected play with "+currentPet.PetType);
                    currentPet.play();
                    break;
                    
                    case 2:
                    System.out.println("You chose to feed your "+currentPet.PetType);
                    currentPet.play();
                    break;
                    
                    case 3:
                    System.out.println("You chose to scold "+currentPet.name+" for being a Broncos fan!");
                    currentPet.play();
                    break;
                    
                    case 4:
                    System.out.println("Program is redirecting you to select another pet.");
                    flagloop2 = false;
                    break;
                    
                    default:
                    flagloop1 = false;
                }

            }
            
            UserInput = pets.nextLine();
            
        }
        System.out.println("Thank you for playing with the Pet Simulator!");
        System.out.println("We enjoyed having you learn about our animal farm.");
        System.out.println("");
    }

}
