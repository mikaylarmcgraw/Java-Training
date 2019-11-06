import java.util.*; 
  
public class Order
{ 
    public static void main(String args[]) 
    { 
        //no input error trapping necessary
        
        //initalizing variables
        String cityOne = null;
        String cityTwo = null;
        String cityThree = null;
        String first = null;
        String second = null;
        String third = null;
        //creating scanner object
        Scanner userInput = new Scanner(System.in);
        
        //capturing user input on cities entered
        System.out.println("This program will ask you to enter in three cities (one at a time) and then will display them in decending order.");
        System.out.println("Please enter first city: ");
        cityOne = userInput.nextLine();
        System.out.println("");
        System.out.println("Now please enter second city: ");
        cityTwo = userInput.nextLine();
        System.out.println("");
        System.out.println("Lastly, please enter third and final city: ");
        cityThree = userInput.nextLine();
        System.out.println("");

           //displaying cities entered:
           System.out.println("Here are the cities you entered: " + cityOne+", " + cityTwo + ", " + cityThree);
           System.out.println("");
            
            if(cityOne.compareTo(cityTwo) > 0 && cityOne.compareTo(cityThree) > 0)
            {
                first = cityOne;
                
                if (cityTwo.compareTo(cityThree) > 0)
                {
                    second = cityTwo;
                    third = cityThree;
                    
                }   
                else
                {
                    second = cityThree;
                    third = cityTwo;
                }    
            }    
            else if (cityTwo.compareTo(cityOne) > 0 && cityTwo.compareTo(cityThree) > 0)
            {
                first = cityTwo;
                
                if (cityOne.compareTo(cityThree) > 0)
                {
                    second = cityOne;
                    third = cityThree;
                }    
                else
                {
                    second = cityThree;
                    third  = cityOne;  
                }    
            }    
            else if (cityThree.compareTo(cityOne) > 0 && cityThree.compareTo(cityTwo) > 0)
            {
                first = cityThree;
                
                if (cityOne.compareTo(cityTwo) > 0)
                {
                    second = cityOne;
                    third = cityTwo;
                }  
                else
                {
                    second = cityTwo;
                    third = cityOne;
                    
                }
                
            }    
    
        //displaying them in descending order
        System.out.println("In descending order here is the list of cities: ");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        
    }

    
}   
