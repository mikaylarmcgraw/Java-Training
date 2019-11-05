import java.util.*; 
  
public class Order
{ 
    public static void main(String args[]) 
    { 
        //no input error trapping necessary
        
        //initalizing variables
        String citiesInputed = null;
        String cityOne = null;
        String cityTwo = null;
        String cityThree = null;
        String first = null;
        String second = null;
        String third = null;
        
        //creating scanner object
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("This program will ask you to enter in three cities and then display them in decending order.");
        System.out.println("When entering in cities please use a comma to seperate the cities with no extra spaces between entering them.");
        System.out.println("Please enter the three cities now: ");
        citiesInputed = userInput.nextLine();
        
        System.out.println("");
        
        String[] cityArray = citiesInputed.split(",");
        
        cityOne = cityArray[0];
        cityTwo = cityArray[1];
        cityThree = cityArray[2];
            
        char[]cityOneArray = cityOne.toCharArray();
        char[]cityTwoArray = cityTwo.toCharArray();
        char[]cityThreeArray = cityThree.toCharArray();
        
        for (int i = 0; i <cityOneArray.length;)
        {
            if (cityOneArray[i] > cityTwoArray[i])
            {
                first = cityOne;
                i = cityOneArray.length;
            }    
            else if (cityOneArray[i] == cityTwoArray[i])
            {
                i++;
            }    
            else 
            {
                first = cityTwo;
                i = cityOneArray.length;
            }    
        }    
        
        for (int j = 0; j < cityThreeArray.length;)
        {
            if (cityTwoArray[j] > cityThreeArray[j]&& first == cityOne)
            {
                second = cityTwo;
                third = cityThree;
                j = cityOneArray.length;
            }    
            else if (cityTwoArray[j] == cityThreeArray[j])
            {
                j++;
            }    
            else 
            {
                second = cityThree;
                third = cityTwo;
                j = cityOneArray.length;
            } 
            
            
        }    
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        
    }

    
}   
