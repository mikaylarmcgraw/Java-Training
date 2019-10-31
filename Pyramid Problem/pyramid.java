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
            if (pyramidLength >= 10)
            {
                
                for (int m = 0; m < (pyramidLength - loopCounter); m++)
                {
                    
                    //System.out.print("+");
                    
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
