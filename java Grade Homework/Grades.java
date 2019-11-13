import java.util.*; 
  
public class Grades
{ 
    public static void main(String args[]) 
    { 
        //no input error trapping necessary
        
        //initalizing variables
        int numberOfStudents = 0;
        String gradesEntered = null;
        
        int aGradeCriteria = 90;
        int bGradeCriteria = 80;
        int cGradeCriteria = 70;
        int dGradeCriteria = 60;
        int grade = 0;
        char gradeLetter = 0;
        int lowestGradePossible = 0;
        int highestGradePossible = 100;
        //creating scannerObject
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        
        System.out.println("Please enter the number of students you'd like to enter grades for: ");
        numberOfStudents = intScanner.nextInt();
        
        //String arrayOfGrades = new String[numberOfStudents];
        
        System.out.println("Now please enter the grades of those students with a space between each of them:");
        gradesEntered = stringScanner.nextLine();

        String[]arrayOfGrades = gradesEntered.split(" ");
        if (arrayOfGrades.length == numberOfStudents)
        {
            for (int i = 0; i < arrayOfGrades.length; i++)
            {
                System.out.println("For student: " + (i+1));
                grade = Integer.parseInt(arrayOfGrades[i]);
                if (grade >= lowestGradePossible && grade<= highestGradePossible)
                {   
                    if (grade >= aGradeCriteria)
                    {
                        gradeLetter = 'A';
                        System.out.println("Student's grade is: "+gradeLetter);
                        
                    }    
                    else if(grade < aGradeCriteria && grade >= bGradeCriteria)
                    {
                        gradeLetter = 'B';
                        System.out.println("Student's grade is: "+gradeLetter);
                        
                        
                    }
                    else if(grade < bGradeCriteria && grade >= cGradeCriteria)
                    {
                        gradeLetter = 'C';
                        System.out.println("Student's grade is: "+gradeLetter);
                        
                    }
                    else if(grade < cGradeCriteria && grade >= dGradeCriteria)
                    {
                        gradeLetter = 'D';
                        System.out.println("Student's grade is: "+gradeLetter);
                        
                    }
                    else
                    {
                        gradeLetter ='F';
                        System.out.println("Student's grade is: "+gradeLetter);
                        
                    }  
               }
               else
               {
                   System.out.println("Please double check student " + (i + 1) + "'s grade");
                   System.out.println("It appears the grade is out of the range 0 - 100.");
               }   
                System.out.println();
            }    
        }
        else
        {
            System.out.println("Error the number of students entered doesn't match the number of grades entered.");
            System.out.println("Please restart program and try again.");
        }
          
    }

}   
