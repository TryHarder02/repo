package assignment2;

		public class Procedure {  
			String nameOfProcedure;
			String nameOfPractitioner;
			double charges;
			String dateOfProcedure;
			
		public Procedure () {
		}    
		
		
		public Procedure(String nameOfProcedure, String dateOfProcedure) {
			this.nameOfProcedure=nameOfProcedure;
			this.dateOfProcedure=dateOfProcedure;
	
			
		}
		public Procedure (String nameOfProcedure, 
				String dateOfProcedure, 
				String nameOfPractitioner, 
				double charges) {
			this.dateOfProcedure=dateOfProcedure;
			this.nameOfPractitioner=nameOfPractitioner;
			this.charges=charges;
			this.nameOfProcedure=nameOfProcedure;
			
		}
		
		//getters
		public String getnameOfProcedure() {
			return nameOfProcedure;
		}
		
		public String getdateOfProcedure() {
			return dateOfProcedure;
		}
		public String getnameOfPractitioner() {
			return nameOfPractitioner;
		}

		public double getcharges() {
			return charges;
		}
		
		//setters
		public void setnameOfProcedure(String nameOfProcedure) {
			this.nameOfProcedure=nameOfProcedure;
		}
		public void setNameOfPractitioner(String nameOfPractitioner) {
			this.nameOfPractitioner=nameOfPractitioner;
		}
		public void setdateOfProcedure(String dateOfProcedure) {
			this.dateOfProcedure=dateOfProcedure;
		}
		public void setcharges(double charges) {
			this.charges=charges;
		}
		@Override
		public String toString() {
		
			return getnameOfProcedure() + " " + getdateOfProcedure()+ " " + getnameOfPractitioner()+ " " + getcharges();
		}
		
}
	
		
				
		

