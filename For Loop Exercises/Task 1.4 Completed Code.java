
//Create a For loop that will execute five times
//Display using println the value of i each time during the loop
//After control is out of the loop, display the value of i 
public class Task1_4ForLoop{
 public static void main (String args[]){
     //no input error trapping needed
     
     int finalivalue=0;
     
     for (int i=0; i<5; i++){
        
        System.out.println("The value of i is: "+i);
        finalivalue=i;
      } 
        
      System.out.println("The final value of i is: "+finalivalue);  
    }
}    
