
//Create a For loop that will execute nine times
//Use <= for the loop control condition test statement
//Display using println the value of i each time during the loop
//After control is out of the loop, display the value of I 

public class Task1_5ForLoop{
 public static void main (String args[]){
     //no input error trapping needed
     
     int finalivalue=0;
     
     for(int i=0; i<=8; i++){
        
        System.out.println("The value of i is: "+i);
        finalivalue=i;
      } 
        
     System.out.println("The final value of i is: "+finalivalue);
    }
}   
