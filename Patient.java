/*
 * Class: CMSC203 
 * Instructor:Gregoriy Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 6/29/2026
 * Platform/compiler: Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: ____Melanie Castro______
*/

public class Patient {
	
		
		String FirstName; 
		String MiddleName;
		String LastName;
		String Address;
		String City;
		String State;
		String ZipCode;
		String PhoneNumber;
		String EmergencyContactName;
		String EmergencyNumber;
		 // No-arg constructor
	    public Patient() {

	    }

	    // 3-name constructor
	    public Patient(String FirstName, String MiddleName, String LastName) {
	    	 this.FirstName = FirstName;
			    this.MiddleName = MiddleName;
			    this.LastName = LastName;
	    }
		public Patient(String FirstName, String MiddleName, String LastName, 
				String Address, String City, String State, String ZipCode,
				String PhoneNumber, String EmergencyNumber, String EmergencyContactName) {
			  this.FirstName = FirstName;
			    this.MiddleName = MiddleName;
			    this.LastName = LastName;
			    this.Address= Address;
			    this.City=City;
			    this.State= State;
			    this.ZipCode= ZipCode;
			    this.PhoneNumber= PhoneNumber;
			    this.EmergencyNumber= EmergencyNumber;
			    this.EmergencyContactName= EmergencyContactName;
			    
			}
		//getters&
		//setters
		
		public String getFirstName() {
	        return FirstName;  
	    }
		public String getLastName() {
	        return LastName;
	    }
		public String getMiddleName() {
	        return MiddleName;
	   
	    }
		 
		public String getAddress() {
	        return Address;
	    }
		public String getCity() {
	        return City;
	    }
		public String getState() {
	        return State;
	    }
		public String getZipCode() {
	        return ZipCode;
	    }
		
	public String getPhoneNumber() {
        return PhoneNumber;
    }
	public String getEmergencyContactName() {
        return EmergencyContactName;
    }
	public String getEmergencyNumber() {
        return EmergencyNumber;
    }
	
	//setters
		
	public void setAddress(String Address) {
	    this.Address = Address;
	}
	public void setState(String State) {
	    this.State = State;
	}
	public void setCity(String City) {
	    this.City = City;
	}
	public void setZipCode(String ZipCode) {
	    this.ZipCode= ZipCode;
	}
	public void setFirstName(String FirstName) {
	    this.FirstName = FirstName;
	}
	public void setLastName(String LastName) {
	    this.LastName = LastName;
	}
		
	public void setMiddleName(String MiddleName) {
	    this.MiddleName = MiddleName;
	}
		
	public void setEmergencyNumber(String EmergencyNumber) {
	    this.EmergencyNumber = EmergencyNumber;
	}
		
	public void setPhoneNumber(String PhoneNumber) {
	    this.PhoneNumber = PhoneNumber;
	}
		
	public void setEmergencyContactName(String EmergencyContactName) {
	    this.EmergencyContactName= EmergencyContactName;
	}
		
	
	//build methods
	public String buildFullName() {
	    return FirstName + " " + MiddleName + " " + LastName;
	}
	public String buildAddress() {
	    return Address + " " + City + " " + State +  " " + ZipCode;
	}
	public String buildEmergencyContact() {
	    return EmergencyContactName + " " + EmergencyNumber;
	}
	
	@Override
	public String toString() {
   return "Patient Name: " + buildFullName()
   + "\nAddress: " + buildAddress()
   + "\n Emergency contact: " + buildEmergencyContact();
	}
}

