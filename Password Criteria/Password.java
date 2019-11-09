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
        int j = 0;
        System.out.println("Password entered is: "+passwordInput);   
        
        if(passwordInput.length() < 8)
        {
             passwordCriteria = "invalid";
             System.out.println("Password is too short please enter a password of atleast 8 characters.");
        }    
        else
        {
            char [] stringToCharArray = passwordInput.toCharArray();
            
            for (int i = 0; i <stringToCharArray.length; i++)
            {
                if (stringToCharArray[i] >= 'a' && stringToCharArray[i] <= 'z')
                {
                    passwordCriteria = "valid";
                }    
                else if (stringToCharArray[i] >= '0' && stringToCharArray[i] <= '9')
                {
                    j++;
                    
                    if (j >= 2)
                    {
                        passwordCriteria = "valid";
                    }    
                    else
                    {
                        passwordCriteria = "invalid";
                    }  
                    
                    
                } 
                else if (stringToCharArray[i] >= 'A' && stringToCharArray[i] <= 'Z')
                {
                    passwordCriteria = "valid";
                    
                }   
                else if (stringToCharArray[i] == ' ')
                {
                    passwordCriteria = "valid";  
                }    
                else
                {
                    passwordCriteria = "invaid";
                    i = stringToCharArray.length;
                }    
            }    

        }    
        
        System.out.println("Password is: " +passwordCriteria);
        
    }    
    
}  
