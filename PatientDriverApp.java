
/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: (Within this project I have created three classes which are patient,procedure, and patient driver app. 
 * Within patient I have created methods, setters, and getters in order to receive user data when asked in driver app later. 
 * Within procedure I have three procedures that I created, one of them with no arg therefore I set the information instead. 
 * The second one with 2 arguments setting just two variables afterwards. 
 * The third accepting all arguments therefore I set none. All of these are important because we need different information for each procedure. 
 * In my driver app I asked the user to input all of their information and then calculated total charges as well as displaying
 *  all built methods and patient information. )
 * Due: 09/30/2026
 * Platform/compiler:Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: ____Melanie Castro ______
*/


package assignment2;
import java.util.Scanner;
public class PatientDriverApp {
	
public static void main (String[]args) {
	

	Scanner input= new Scanner(System.in);
	
	System.out.println("Enter first name: "); 
	String firstName = input.nextLine();
	
	System.out.println("Enter middle name: ");
	String middleName=input.nextLine();
	
	System.out.println("Enter last name: ");
		String lastName= input.nextLine();
	
		System.out.println("Enter phone number: ");
		String phoneNumber=input.nextLine();
		
		System.out.println("Street address: ");
		String streetAddress=input.nextLine();
		System.out.println("City: ");
		String city=input.nextLine();
		
		System.out.println("Enter state: ");
		String state=input.nextLine();
		
		System.out.println("zip code: ");
		String zipCode=input.nextLine();
		
		System.out.println("Emergency contact name: " + " ");
		String emergencyContactName= input.nextLine();
		
		System.out.println("Emergency contact number: " + " ");
		String emergencyContactNumber=input.nextLine();
	
		
		Patient patient= new Patient (
				firstName,
				middleName,
				lastName,
				streetAddress,
				zipCode,
				city,
				state,
				emergencyContactName,
				emergencyContactNumber,
				phoneNumber);
		
		//procedure one

		
				
		System.out.println("What is the name of the procedure? ");
		String nameOfProcedure= input.nextLine();
		
		System.out.println("What is the date of procedure? ");
		String dateOfProcedure= input.nextLine();
		
		System.out.println("What is the name of the practitioner? ");
		String nameofPractitioner= input.nextLine();
		
		System.out.println("What are the charges for this procedure? ");
		double charges=input.nextDouble();

		input.nextLine();

		Procedure procedure1= new Procedure();
				
			procedure1.setnameOfProcedure(nameOfProcedure);
			procedure1.setdateOfProcedure(dateOfProcedure);
			procedure1.setNameOfPractitioner(nameofPractitioner);
				procedure1.setcharges(charges);
		
		

	System.out.println("What is the name of procedure? ");
	String nameOfProcedure2=input.nextLine();
	System.out.println("What is the date of procedure?  ");
	String dateOfProcedure2=input.nextLine();
	System.out.println("What is the name Of Practitioner?: ");
	String nameOfPractitioner2=input.nextLine();
	System.out.println("What are the charges?: ");
	double charges2= input.nextDouble();
	input.nextLine();
	
				//1st procedure SYst
				Procedure procedure2= new Procedure(nameOfProcedure2,
				     dateOfProcedure2);	
				procedure2.setNameOfPractitioner(nameOfPractitioner2);
				procedure2.setcharges(charges2);
	 	
	
	
				System.out.println("What is the name of the procedure? ");
				String nameOfProcedure3 = input.nextLine();

				System.out.println("What is the date of this procedure? ");
				String dateOfProcedure3 = input.nextLine();

				System.out.println("What is the name of the practitioner? ");
				String nameOfPractitioner3 = input.nextLine();

				System.out.println("What are the charges? ");
				double charges3 = input.nextDouble();
				input.nextLine();
				

		Procedure procedure3 =new Procedure(nameOfProcedure3, dateOfProcedure3, nameOfPractitioner3, charges3);
		
		displayPatient(patient);

		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);

		double totalCharges = calculateTotalCharges(
		        procedure1,
		        procedure2,
		        procedure3
		);

		System.out.printf("Total Charges: $%,.2f%n", totalCharges);
		input.close();
		
		
		
		
}

		public static void displayPatient (Patient patient) {
			System.out.println(patient);
			
			
			
			
		}
		
		public static void displayProcedure(Procedure procedure) {
			System.out.println(procedure);
		}
		
		public static double calculateTotalCharges(Procedure procedure,Procedure procedure2 ,Procedure procedure3) {
			double doubleTotal= procedure.getcharges()+
			+procedure2.getcharges()
			+procedure3.getcharges();
			
			return doubleTotal;
			
		}
		
		
		
}

	