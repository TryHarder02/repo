/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: (in this program I am collecting information from users in order to calculate final grades using scores from several categories)
 * Due: 09/16/2026
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
  independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Melanie Castro__________
*/


package gradeCalculator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class GradeCalculator {

    public static void main(String[] args) {
    	

        try (Scanner input = new Scanner(System.in)) {

 String courseName = "";
 int numberOfCategories = 0;
  boolean defaultConfigurationUsed = false;
  

  String categoryName1 = "";
  String categoryName2 = "";
  String categoryName3 = "";
  int categoryWeight1 = 0;
  int categoryWeight2 = 0;
  int categoryWeight3 = 0;

          
  try {  File file = new File("gradeconfig.txt");
      Scanner fileInput = new Scanner(file);
  courseName = fileInput.nextLine();
   numberOfCategories = fileInput.nextInt();

  if (numberOfCategories != 3) {

   System.out.println( "Invalid number of categories; Default configuration will be used.");
   numberOfCategories = 3;
   categoryName1 = "Projects";
   categoryWeight1 = 40;

   categoryName2 = "Quizzes";
   categoryWeight2 = 30;

   categoryName3 = "Exams";
   categoryWeight3 = 30;

   defaultConfigurationUsed = true;

                    
   } 
                
   else {
	   int totalCategoryWeight = 0;

       
       for (int i = 1; i <= numberOfCategories; i++) {

           if (i == 1) {

   categoryName1 = fileInput.next();
   categoryWeight1 = fileInput.nextInt();
    totalCategoryWeight += categoryWeight1;

  } else if (i == 2) {

  categoryName2 = fileInput.next();
   categoryWeight2 = fileInput.nextInt();

  totalCategoryWeight += categoryWeight2;
   } else 
    {
 categoryName3 = fileInput.next();
 categoryWeight3 = fileInput.nextInt();
 totalCategoryWeight += categoryWeight3;
 
}
                        
   
}
       
  if (totalCategoryWeight != 100) {

         System.out.println(
               "Error: Categories do not add up to 100; Default configuration will be used."
           );
    categoryName1 = "Projects";
    categoryWeight1 = 40;

    categoryName2 = "Quizzes";
    categoryWeight2 = 30;

    categoryName3 = "Exams";
    categoryWeight3 = 30;

     defaultConfigurationUsed = true;
                      
     }
   }

         
   fileInput.close();//close file.

                     
} 
  catch (FileNotFoundException e) {
  System.out.println(
 "Configuration file cannot be found; Default configuration will be used.");
                
  numberOfCategories = 3;

  categoryName1 = "Projects";
  categoryWeight1 = 40;

  categoryName2 = "Quizzes";
  categoryWeight2 = 30;

  categoryName3 = "Exams";
  categoryWeight3 = 30;

  defaultConfigurationUsed = true;

} catch (InputMismatchException e) {

   System.out.println("Invalid configuration file; Default configuration will be used.");
          
   numberOfCategories = 3;

   categoryName1 = "Projects";
   categoryWeight1 = 40;

   categoryName2 = "Quizzes";
   categoryWeight2 = 30;

   categoryName3 = "Exams";
   categoryWeight3 = 30;

   defaultConfigurationUsed = true;
    }

      
   String firstName;
   String lastName;
   double overallAverage = 0;
   double categoryAverage1 = 0;
   double categoryAverage2 = 0;
   double categoryAverage3 = 0;
   try {
	   File file = new File("grades_input.txt");
       Scanner secondFileInput = new Scanner(file);

       firstName = secondFileInput.next();//read and store
       lastName = secondFileInput.next();

       for (int i = 1; i <= numberOfCategories; i++) {

       String categoryName;
       int categoryWeight;

    if (i == 1) {
    categoryName = categoryName1;
    categoryWeight = categoryWeight1;
    }
                       
    else if (i == 2) {
    	 categoryName = categoryName2;
         categoryWeight = categoryWeight2;
    } 
    else {
    categoryName = categoryName3;
    categoryWeight = categoryWeight3;
}
    
    
 String categoryNameInput = secondFileInput.next();
 int numberOfGrades = secondFileInput.nextInt();
 double categoryTotal = 0;
 for (int g = 1; g <= numberOfGrades; g++) {
	 
 double grade = secondFileInput.nextDouble();
 categoryTotal = categoryTotal + grade;
 }

  if (!categoryNameInput.equals(categoryName)) {
  System.out.println("Error: Category name does not match configured name. Skipping category.");
  }                       

  else if (numberOfGrades <= 0) {

   System.out.println("Error: Number of grades must be greater than 0. Skipping category.");
  }  
                            
  else {
	  double categoryAverage =categoryTotal / numberOfGrades;
       
        double weightedContribution = categoryAverage * (categoryWeight / 100.0);
          overallAverage = overallAverage + weightedContribution;
          
  if (i == 1) {
	  categoryAverage1 = categoryAverage;

  }
  else if (i == 2) {
    categoryAverage2 = categoryAverage;
 } 
  else {
 categoryAverage3 = categoryAverage;
  }
     }                 
       }

 secondFileInput.close();         
  char letterGrade;
 if (overallAverage >= 90) {

   letterGrade = 'A';

  } else if (overallAverage >= 80) {

   letterGrade = 'B';

  } else if (overallAverage >= 70) {

  letterGrade = 'C';

  } else if (overallAverage >= 60) {

    letterGrade = 'D';

   } else {

  letterGrade = 'F';
  }

   char choice;

    do {   System.out.print("Apply +/- grading? (Y/N): ");

    choice = Character.toUpperCase( input.next().charAt(0));
    if (choice != 'Y' && choice != 'N') {

    System.out.println("Invalid input: Enter Y or N.");
           
    }                        
                    

 } while (choice != 'Y' && choice != 'N');
   String finalLetterGrade =
   String.valueOf(letterGrade);

   if (choice == 'Y') {double decimal = overallAverage - (int) overallAverage;
   if (decimal >= 0.50 && letterGrade != 'A') {
   finalLetterGrade = letterGrade + "+";
} 
   else if (decimal <= 0.20 && letterGrade != 'F') {
   finalLetterGrade = letterGrade + "-";
 
   }
  }     

  System.out.println();
      System.out.println("========================================");
      System.out.println("CMSC203 Project 1 - Grade Calculator");
      System.out.println("========================================");

      System.out.println("Course: " + courseName);

      System.out.println( "Student: " + firstName + " " + lastName);
 System.out.println();
  System.out.println("Category Results:");

 
  System.out.printf( "%s (%d%%): average = %.2f%n", categoryName1, categoryWeight1, categoryAverage1);
 
 System.out.printf(
  "%s (%d%%): average = %.2f%n", categoryName2, categoryWeight2,  categoryAverage2 );

 System.out.printf(  "%s (%d%%): average = %.2f%n", categoryName3, categoryWeight3,  categoryAverage3 );

 System.out.printf(
  "Overall numeric average: %.2f%n", overallAverage);
 
System.out.println( "Base letter grade: " + letterGrade);
         
    System.out.println( "Final letter grade: " + finalLetterGrade );

   System.out.println( "Default configuration used: "+ defaultConfigurationUsed);
          
           
    try {
  PrintWriter output =
    new PrintWriter("grades_report.txt");
   output.println(   "========================================");
   output.println( "CMSC203 Project 1 - Grade Calculator");
   output.println( "========================================");
   output.println( "Course: " +courseName  );
   output.println("Student: " +firstName + "" + lastName);
        output.println();
        output.println("Category Results:");

   output.printf(
               "%s (%d%%): average = %.2f%n",
                categoryName1,
                categoryWeight1,
               categoryAverage1);
              
    output.printf( "%s (%d%%): average = %.2f%n",categoryName2, categoryWeight2, categoryAverage2);
           
    output.printf( "%s (%d%%): average = %.2f%n",categoryName3, categoryWeight3, categoryAverage3);
    		

    output.printf( "Overall numeric average: %.2f%n", overallAverage);
 
    output.println( "Base letter grade: " +letterGrade);
    output.println( "Final letter grade: " + finalLetterGrade);
  
      
           
   output.println(  "Default configuration used: " + defaultConfigurationUsed);
   output.close();

   System.out.println();
   System.out.println( "Summary written to grades_report.txt");

            
   } 
    catch (FileNotFoundException e) {
           System.out.println("Error: Could not create grades_report.txt.");
    }

           System.out.println();
            System.out.println("Program complete. Goodbye!");

    } 
     catch (FileNotFoundException e) {

               System.out.println( "Error: File cannot be found!");

               System.exit(123);

    } catch (InputMismatchException e) {

      System.out.println("Error: Invalid numeric value in grades_input.txt!");
                    
               

      System.exit(123);
            }
        }
    }
}