import java.util.*; 
  
public class Count
{ 
    public static void main(String args[]) 
    { 
        //initaizing variables
        String numberInput = null;
        String max = null;
        int arrayLength = 0;
        //creating scanner object
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter a string of numbers seperated with commas.");
        System.out.println("Please don't add any extra spaces when entering in numbers.");
        numberInput = userInput.nextLine();
        
        System.out.println();

        String[]arrayOfNumbers = numberInput.split(",");
        arrayLength = arrayOfNumbers.length-1;
        
        for (int i = 0; i < arrayLength; i++)
        {
            if (arrayOfNumbers[i].compareTo(arrayOfNumbers[i+1]) < 0)
            {
                 max = arrayOfNumbers[i+1];
                    
            }  
            else
            {
                max = arrayOfNumbers[i];
                    
            }    
            
   
            
        }   
        System.out.println(max);
    }
}
