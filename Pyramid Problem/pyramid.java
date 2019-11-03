import java.util.*; 
  
public class Pyramid 
{ 
    public static void main(String args[]) 
    { 
        //no input error trapping necessary
        
        //initalizing variables
        int pyramidLength = 0;
        int loopCounter = 1;
        
        //creating scanner object
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter the length you'd like for your pyramid:");
        pyramidLength = userInput.nextInt();
        
        System.out.println("");
        
        while (loopCounter <= pyramidLength)
        { 
 
            
            if (loopCounter >= 10)
            {
                for (int j = 0; j < pyramidLength - loopCounter; j++)
                {
                    System.out.print(" ");
                    
                }    
                
            }
            
            if (loopCounter < 10 && pyramidLength >= 10)
            {    
                for (int w = 0; w < pyramidLength - 9; w++)    
                {
                    System.out.print(" ");
                
                } 
            }
            
            
            for (int k = 0; k < pyramidLength - loopCounter; k++)
            {
                    System.out.print("   ");
                    
            }    
            
            for (int i = loopCounter; i > 1; i--)
            {
                System.out.print(" " + i + " ");
                
            }
            
            for (int j = 1; j <= loopCounter; j++)
            {
                System.out.print(" " + j + " ");
                
            }    
            

            System.out.println("");
            loopCounter++;
        }
        
    }

} 
