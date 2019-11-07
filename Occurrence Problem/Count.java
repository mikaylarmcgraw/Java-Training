import java.util.*; 
  
public class Count
{ 
    public static void main(String args[]) 
    { 
        //initaizing variables
        String numberInput = null;
        int max = 0;
        int arrayLength = 0;
        int occurrence = 0;
        //creating scanner object
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter a string of numbers seperated with spaces.");
        System.out.println("Please don't add any extra spaces when entering in numbers.");
        numberInput = userInput.nextLine();
        
        System.out.println();
        
        String[]arrayOfNumbers = numberInput.split(" ");
        arrayLength = arrayOfNumbers.length-1;
        
        System.out.println("Here are the numbers you entered in: " + numberInput);
        
        for (int i = 1; i <= arrayLength; i++)
        {
            
            if (Integer.parseInt((arrayOfNumbers[max])) < Integer.parseInt((arrayOfNumbers[i])))
            {
                 max = i;
                    
            }  

            
        }   
        System.out.println("The maximum from the list of numbers entered is: " + arrayOfNumbers[max]);
        
        for (int j = 0; j <=arrayLength; j++)
        {
            if (Integer.parseInt((arrayOfNumbers[max])) == Integer.parseInt((arrayOfNumbers[j])))
            {
                occurrence++;
            }
            
        }    
        
        System.out.println("It occurs: " + occurrence + " times.");
        
    }
}
