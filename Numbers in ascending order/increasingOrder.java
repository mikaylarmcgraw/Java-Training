import java.util.*; 
  
public class increasingOrder
{ 
    public static void main(String args[]) 
    { 
        //no input error trapping necessary
        
        //initalizing variables
        double firstNum = 0;
        double secondNum = 0;
        double thirdNum = 0;
        
        //creating scanner object
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter first number: ");
        firstNum = userInput.nextDouble();
        System.out.println();
        System.out.println("Please enter second number: ");
        secondNum = userInput.nextDouble();
        System.out.println();
        System.out.println("Please enter third number: ");
        thirdNum = userInput.nextDouble();
        System.out.println();
        
        ascendingOrder(firstNum,secondNum,thirdNum);
        
    }
    
    public static void ascendingOrder(double firstNum, double secondNum, double thirdNum)
    {
        double max = 0;
        double mid = 0;
        double min = 0;
        
        if (firstNum > secondNum && firstNum > thirdNum)
        {
            max = firstNum;
            
            if (secondNum > thirdNum)
            {
                mid = secondNum;
                min = thirdNum;
            }    
            else
            {
                mid = thirdNum;
                min = secondNum;
            }    
                
        }    
        else if (secondNum > firstNum && secondNum > thirdNum)
        {
            max = secondNum;
            
            if (firstNum > thirdNum)
            {
                mid = firstNum;
                min = thirdNum;
                
            }    
            else
            {
                mid = thirdNum;
                min = firstNum;
            }    
        }    
        else if (thirdNum > firstNum && thirdNum > secondNum)
        {
            max = thirdNum;
            
            if(firstNum > secondNum)
            {
                mid = firstNum;
                min = secondNum;
            }    
            else
            {
                mid = secondNum;
                min = firstNum;
                
            }    
                
        }    
        System.out.println("Here are the numbers in ascending order: " + min + ", " + mid + ", " + max);
        
    }    
    
}    
