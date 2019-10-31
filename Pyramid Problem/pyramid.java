import java.util.*; 
  
public class Pyramid 
{ 
    public static void main(String args[]) 
    { 
        //no input error trapping necessary
        
        //initalizing variables
        int pyramidLength = 0;
        
        //creating scanner object
        Scanner userInput=new Scanner(System.in);
        
        System.out.println("Please enter the length you'd like for your pyramid:");
        pyramidLength = userInput.nextInt();
        
        System.out.println("");
        while (pyramidLength >= 1)
        {
            for (int i = pyramidLength; i > 1; i--)
            {
                System.out.print(" " + i + " ");
                
            }
            
            for (int j = 1; j <= pyramidLength; j++)
            {
                System.out.print(" " + j + " ");
                
            }    
            

            System.out.println("");
            pyramidLength--;
        }
        
    }

}   
