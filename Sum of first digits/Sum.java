import java.util.*; 
  
public class Sum
{ 
    public static void main(String args[]) 
    { 
        //no input error trapping necessary
        
        //initalizing variables
        String numberInput = null;
       
        int min = 100;
        int max = 1000;
        int sum = 0;
     
        //creating scanner object
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter a number between 100 - 1000:");
        numberInput = userInput.nextLine();
        
        int numberInputInt = Integer.parseInt(numberInput);
        
        if (numberInputInt >= min && numberInputInt <= max)
        {
            //creating an array of char
            //putting my string number into char array to break up the integers
            char [] stringToCharArray = numberInput.toCharArray();
            
            for (int i = 0; i < stringToCharArray.length; i++)
            {
                    sum = sum + Character.getNumericValue(stringToCharArray[i]);

            }    
            
            System.out.println("The sum of the numbers is: " + sum);
        }
        else
        {
            
            System.out.println("Please restart program and enter a number between 100 - 1000.");
        }    
        
        
    }

}   
