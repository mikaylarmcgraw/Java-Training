//Stack exercise

public class stack
{
    //initializing variables
    int arrayLength = 5;  
    int topOfStack = -1;
    //creating an array type integer
    int[] stackArray;
    
    public stack()
    {
        stackArray = new int [arrayLength];

        
    }
    
    
    public void push(int userIntegerEntered)
    {
        topOfStack++;
        if (topOfStack >= stackArray.length)
        {
            topOfStack--;
            System.out.println("Cannot push anymore numbers into stack it's reached its limit.");
            System.out.println("Please use the pop method to clear some space to push more integers.");
            
        }    
        else
        {
            
            stackArray[topOfStack] = userIntegerEntered; 
            System.out.println("Index value is: " + topOfStack + " Element value is: " + stackArray[topOfStack]);
            
        

        }   
    }
         
    
    public void pop()
    {
        if (topOfStack < 0)
        {
            System.out.println("Program cannot pop anymore numbers the stack is already clear.");
            System.out.println("Please push a few integers into stack to continue popping!");
            
            
        }
        else
        {
            System.out.println("The element you chose to pop was:");
            System.out.println("Index value is: " + (topOfStack) + " Element value is: " + stackArray[topOfStack]);
            stackArray[topOfStack] = 0; 
            topOfStack--;
        }
    }
    
    public void peek()
    {
       System.out.println("Here's the top of the stack:"); 
       System.out.println("Index value is: " + (topOfStack) +" Element value is: " + stackArray[topOfStack]);
       
    }
    
    public void displayStack()
    {
        System.out.println("Here are the elements within your stack: ");
        
        //looping to display all index and element values in stack
        for (int i = 0; i < stackArray.length; i++)
        {
            
            System.out.println("Index value: " + i + " Element value: " + stackArray[i]); 
        
        }
    }
    
}  
