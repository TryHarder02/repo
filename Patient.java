

package assignment2;

		public class Patient {
			String firstName;
			String middleName;
			String lastName;
			String streetAddress;
			String zipCode;
			String city;
			String state;
			String emergencyContactName;
			String emergencyContactNumber;
			String phoneNumber;
			
			
			//getters
			public String getFirstName() 
			{
				return firstName;
			}
			
			public String getMiddleName() 
			{
				return middleName;
			}
			public String getlastName() 
			{
				return lastName;
			}
			public String getstreetAddress() 
			{
				return streetAddress;
			}
			public String getcity()
			{
				return city;
			}
			
			public String getState() {
				return state;
			}
			
		   public String getzipCode() {
			return zipCode;
		   }
			public String getemergencyContactName() {
				return emergencyContactName;
			}
			public String getemergencyContactNumber() {
				return emergencyContactNumber;
			}
			public String getphoneNumber() {
				return phoneNumber;
			}
		
		   
		   //setters
		   public void setfirstName (String firstName) {
			   this.firstName= firstName;
		   }
		   public void setmiddleName(String middleName) {
			   this.middleName=middleName;
		   }
		   public void setlastName(String lastName) {
			   this.lastName=lastName;
		   }
		   public void setstreetAddress(String streetAddress) {
			   this.streetAddress=streetAddress;
		   }
		public void setcity(String city) {
			this.city=city;
			
		}
		public void setstate(String state) {
			this.state=state;
			
		}
			
		public void setzipCode(String zipCode) {
			this.zipCode=zipCode;
		}
		public void setemergencyContactName(String emergencyContactName) {
			this.emergencyContactName=emergencyContactName;
		}
		public void setemergencyContactNumber(String emergencyContactNumber) {
			this.emergencyContactNumber=emergencyContactNumber;
		}
		public void setphoneNumber(String phoneNumber) {
			this.phoneNumber=phoneNumber;
		}
		
		
	
		public Patient(String firstName, String middleName, String lastName){
				this.firstName=firstName;
				this.middleName=middleName;
				this.lastName=lastName; 					//three attributes
				
			}
		
			
			public Patient() {
				            		//no arg
			}
			public Patient (String firstName,
			String middleName,
			String lastName,
			String streetAddress,
			String zipCode,                        //all attributes 
			String city,
			String state,
			String emergencyContactName,
			String emergencyContactNumber,
			String phoneNumber) { this.firstName=firstName;
			this.lastName=lastName;
			this.middleName=middleName;
			this.streetAddress=streetAddress;
			this.city=city;
			this.state=state;
			this.zipCode=zipCode;
			this.emergencyContactName=emergencyContactName;
			this.emergencyContactNumber=emergencyContactNumber;
			this.phoneNumber=phoneNumber;
			}
			
			
			public String buildFullName(){
				return getFirstName() + "  " + getMiddleName() +  "  " + getlastName();
			}
			public String buildAddress() {
				return getstreetAddress() + " " + getcity() + " " + getState() + " " + getzipCode();
			}
			public String buildEmergencyContact() {
				return getemergencyContactName()+ " " + getemergencyContactNumber();
			}
			public String buildPhoneNumber() {
				return getphoneNumber();
			}
			
			@Override
			public String toString() {
				
				return 	"Full Name:" + buildFullName()+ "\n"+
						"Address: " + buildAddress () +"\n"+
					    "Emergency Contact: " + "\n" 
						 +  buildEmergencyContact() + "\n"+
						 "Phone Number: " + "\n" + 
				        buildPhoneNumber();
				     
			}
		}

			
			
			
			