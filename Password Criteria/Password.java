import java.util.*; 
  
public class Password
{ 
    public static void main(String args[]) 
    { 
        //initalizing variables
        String passwordInput = null;
        String passwordCriteria = "valid";
        
        //creating scanner object
        Scanner userInput = new Scanner(System.in);
        
        //capturing user input
        System.out.println("This program will ask you to enter in a password and check if it's valid or not.");
        System.out.println("-The password must have at least eight characters");
        System.out.println("-The password must contain only letters and digits");
        System.out.println("-The password must contain at least two digits");
        System.out.println("If the password meets this criteria it will return a message saying 'valid'.");
        System.out.println("If not it will return a message stating that the password inpute is invalid.");
        System.out.println();
        System.out.println("Please enter your password:");
        passwordInput = userInput.nextLine();
        passwordValidation(passwordInput);
        
        
    }
    
    public static void passwordValidation(String passwordInput)
    {   
        String passwordCriteria = "valid";
        
        System.out.println("Password entered is: "+passwordInput);
        
        if(passwordInput.length() < 8)
        {
             passwordCriteria = "invalid";
            
        }    
        else
        {
            char [] stringToCharArray = passwordInput.toCharArray();
            
            for (int i = 0; i <stringToCharArray.length; i++)
            {
                if (stringToCharArray[i] <= 'z' || stringToCharArray[i] <= 'Z')
                {
                    passwordCriteria = "valid";
                }    
                else if (stringToCharArray[i] <= '9')
                {
                    passwordCriteria = "valid";
                    
                }    
                else
                {
                    passwordCriteria = "invaid";
                    
                }    
            }    
            
            
        }    
        
        System.out.println("Password is: " +passwordCriteria);
        
    }    
    
}  
